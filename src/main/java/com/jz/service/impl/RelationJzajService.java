package com.jz.service.impl;

import com.jz.dao.RelationJzajMapper;
import com.jz.model.RelationJzaj;
import com.jz.model.SchedulerConfig;
import com.jz.service.IRelationJzajService;
import com.jz.service.ISchedulerConfigService;
import com.jz.utils.DjsjSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service("relationJzajService")
public class RelationJzajService implements IRelationJzajService {
    private static final Logger logger = LoggerFactory.getLogger(RelationJzajService.class);

    @Autowired
    private RelationJzajMapper relationJzajMapper;

    @Autowired
    private ISchedulerConfigService schedulerConfigService;

    @Transactional
    public void batchRelationJzaj(List<RelationJzaj> relationJzajs){
        if(relationJzajs==null||relationJzajs.size()==0){
            return;
        }

        List<SchedulerConfig> schedulerConfigs=schedulerConfigService.getSchedulerConfig("ajTrigger");
        if(CollectionUtils.isEmpty(schedulerConfigs)){
            throw  new RuntimeException("找不到定时任务");
        }

        SchedulerConfig schedulerConfig=schedulerConfigs.get(0);

        logger.info("排序集合数据");
        Collections.sort(relationJzajs,new DjsjSort());

        //获取一次同步的2000条数据按登记时间排序最后的时间，将此时间更新到数据库
        if(relationJzajs.size()>0){
            logger.info("更新批次最新时间");
            RelationJzaj relationJzaj=relationJzajs.get(0);
            schedulerConfig.setStartTime(relationJzaj.getDjsj());
            schedulerConfigService.updateSchedulerConfig(schedulerConfig);
        }

        if(relationJzajs!=null&&relationJzajs.size()>0){
            logger.info("RelationJzajService excute");
            for (RelationJzaj item : relationJzajs){
                RelationJzaj relationJzaj=relationJzajMapper.selectByPrimaryKey(item.getAjbh());
                if(relationJzaj==null){
                    relationJzajMapper.insert(item);
                }
            }
        }
    }

}
