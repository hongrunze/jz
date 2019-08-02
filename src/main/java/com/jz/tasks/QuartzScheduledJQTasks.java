package com.jz.tasks;

import com.jz.model.RelationJzaj;
import com.jz.serviceUtil.WbfwQueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configurable
@EnableScheduling
public class QuartzScheduledJQTasks {
    private static final Logger logger = LoggerFactory.getLogger(QuartzScheduledJQTasks.class);

    public void synchronizeJq() {
        logger.info("同步警情 start");

    }
}
