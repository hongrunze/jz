package com.jz.tasks;


import com.jz.model.RelationJzaj;
import com.jz.service.impl.RelationJzajService;
import com.jz.serviceUtil.WbfwQueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configurable
@EnableScheduling
public class QuartzScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(QuartzScheduledTasks.class);

    @Autowired
    private RelationJzajService relationJzajService;



    public void synchronizeAj() {
        logger.info("同步案件 start");
        try{
           List<RelationJzaj> relationJzajs= WbfwQueryUtil.callDxyhdjzl();
            relationJzajService.batchRelationJzaj(relationJzajs);
        }catch (Exception ex){
            logger.error("同步数据",ex);
        }
    }

}
