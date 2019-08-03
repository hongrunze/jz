package com.jz.configure;

import com.jz.model.SchedulerConfig;
import com.jz.service.ISchedulerConfigService;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 从数据库定时更新任务
 **/
@Configuration
@EnableScheduling
@Component
public class ScheduleRefreshDatabase {
    @Autowired
    private ISchedulerConfigService schedulerConfigService;

    private static final Logger logger = LoggerFactory.getLogger(ScheduleRefreshDatabase.class);

    @Resource(name = "jobTrigger")
    private CronTrigger cronTrigger;


    @Resource(name = "jqTrigger")
    private CronTrigger jqTrigger;


    @Resource(name = "scheduler")
    private Scheduler scheduler;

    @Scheduled(fixedRate = 5000) // 每隔5s查库，并根据查询结果决定是否重新设置定时任务
    public void scheduleUpdateCronTrigger() throws SchedulerException {
        //判断是否重置案件定时任务
        resetSheduleCron(cronTrigger);

        //判断是否重置警情定时任务
        resetSheduleCron(jqTrigger);
    }

    private void resetSheduleCron(CronTrigger tempTrigger) throws SchedulerException {
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(tempTrigger.getKey());
        String currentCron = trigger.getCronExpression();// 当前Trigger使用的
        List<SchedulerConfig> schedulerConfigs= schedulerConfigService.getSchedulerConfig(tempTrigger.getKey().getName());
        if(schedulerConfigs==null||schedulerConfigs.size()<1){
            return;
        }
        String searchCron = schedulerConfigs.get(0).getCron();// 从数据库查询出来的
        logger.info(trigger.getKey().getName()+"当前Cron"+currentCron);
        logger.info(trigger.getKey().getName()+"查询Cron"+searchCron);
        if (currentCron.equals(searchCron)) {
            // 如果当前使用的cron表达式和从数据库中查询出来的cron表达式一致，则不刷新任务
        } else {
            // 表达式调度构建器
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(searchCron);
            // 按新的cronExpression表达式重新构建trigger
            trigger = (CronTrigger) scheduler.getTrigger(tempTrigger.getKey());
            trigger = trigger.getTriggerBuilder().withIdentity(tempTrigger.getKey())
                    .withSchedule(scheduleBuilder).build();
            // 按新的trigger重新设置job执行
            scheduler.rescheduleJob(tempTrigger.getKey(), trigger);
        }
    }


}
