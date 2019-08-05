package com.jz.service.impl;

import com.jz.dao.RelationJzajMapper;
import com.jz.dao.RelationJzjqMapper;
import com.jz.model.RelationJzaj;
import com.jz.model.RelationJzjq;
import com.jz.model.SchedulerConfig;
import com.jz.service.IRelationJzjqService;
import com.jz.service.ISchedulerConfigService;
import com.jz.utils.DjsjJqSort;
import com.jz.utils.DjsjSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service("relationJzjqService")
public class RelationJzjqService implements IRelationJzjqService {
    private static final Logger logger = LoggerFactory.getLogger(RelationJzjqService.class);

    @Autowired
    private RelationJzjqMapper relationJzjqMapper;

    @Autowired
    private ISchedulerConfigService schedulerConfigService;

    public void batchRelationJzjq(List<RelationJzjq> relationJzjqs){
        if(relationJzjqs==null||relationJzjqs.size()==0){
            return;
        }
        List<SchedulerConfig> schedulerConfigs=schedulerConfigService.getSchedulerConfig("jqTrigger");
        if(CollectionUtils.isEmpty(schedulerConfigs)){
            throw  new RuntimeException("找不到定时任务");
        }



        SchedulerConfig schedulerConfig=schedulerConfigs.get(0);

        logger.info("排序集合数据");
        Collections.sort(relationJzjqs,new DjsjJqSort());

        //获取一次同步的2000条数据按登记时间排序最后的时间，将此时间更新到数据库
        if(relationJzjqs.size()>0){
            logger.info("更新批次最新时间");
            RelationJzjq relationJzjq=relationJzjqs.get(0);
            schedulerConfig.setStartTime(relationJzjq.getDjsj());
            schedulerConfigService.updateSchedulerConfig(schedulerConfig);
        }

        if(!CollectionUtils.isEmpty(relationJzjqs)){
            logger.info("RelationJzjqService excute");
            for (RelationJzjq item : relationJzjqs){
                if(relationJzjqMapper.selectByPrimaryKey(item.getJqbh())==null){
                    relationJzjqMapper.insert(item);
                }
            }
        }
    }

}
