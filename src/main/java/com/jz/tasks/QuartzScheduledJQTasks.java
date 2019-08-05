package com.jz.tasks;

import com.jz.model.RelationJzaj;
import com.jz.model.RelationJzjq;
import com.jz.model.SchedulerConfig;
import com.jz.service.IRelationJzajService;
import com.jz.service.IRelationJzjqService;
import com.jz.service.ISchedulerConfigService;
import com.jz.serviceUtil.WbfwQueryJqUtil;
import com.jz.serviceUtil.WbfwQueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
@Configurable
@EnableScheduling
public class QuartzScheduledJQTasks {
    private static final Logger logger = LoggerFactory.getLogger(QuartzScheduledJQTasks.class);

    @Autowired
    private IRelationJzjqService relationJzjqService;

    @Autowired
    private ISchedulerConfigService schedulerConfigService;

    public void synchronizeJq() {
        logger.info("同步警情 start");
        try{
            List<SchedulerConfig> schedulerConfigs=schedulerConfigService.getSchedulerConfig("ajTrigger");
            if(CollectionUtils.isEmpty(schedulerConfigs)){
                return;
            }
            SchedulerConfig schedulerConfig=schedulerConfigs.get(0);
            List<RelationJzjq> relationJzajs= WbfwQueryJqUtil.callDxyhdjzl(schedulerConfig.getNumRow(),schedulerConfig.getStartTime());

            relationJzjqService.batchRelationJzjq(relationJzajs);
        }catch (Exception ex){
            logger.error("同步警情错误",ex);
        }
    }
}
