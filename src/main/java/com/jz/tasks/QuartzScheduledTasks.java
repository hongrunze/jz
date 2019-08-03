package com.jz.tasks;


import com.jz.model.RelationJzaj;
import com.jz.model.SchedulerConfig;
import com.jz.service.IRelationJzajService;
import com.jz.service.ISchedulerConfigService;
import com.jz.service.impl.RelationJzajService;
import com.jz.serviceUtil.WbfwQueryUtil;
import com.jz.utils.DjsjSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Component
@Configurable
@EnableScheduling
public class QuartzScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(QuartzScheduledTasks.class);

    @Autowired
    private IRelationJzajService relationJzajService;

    @Autowired
    private ISchedulerConfigService schedulerConfigService;

    public void synchronizeAj() {
        logger.info("同步案件 start");
        try{
            List<SchedulerConfig> schedulerConfigs=schedulerConfigService.getSchedulerConfig("ajTrigger");
            if(CollectionUtils.isEmpty(schedulerConfigs)){
               return;
            }
            SchedulerConfig schedulerConfig=schedulerConfigs.get(0);
            List<RelationJzaj> relationJzajs= WbfwQueryUtil.callDxyhdjzl(schedulerConfig.getNumRow(),schedulerConfig.getStartTime());

            relationJzajService.batchRelationJzaj(relationJzajs);
        }catch (Exception ex){
            logger.error("同步数据",ex);
        }
    }

}
