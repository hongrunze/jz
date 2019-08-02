package com.jz.configure;

import com.jz.tasks.QuartzScheduledJQTasks;
import com.jz.tasks.QuartzScheduledTasks;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.quartz.Trigger;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * quartz配置
 **/
@Configuration
public class SchedledConfiguration {
    /**
     * Details：配置定时任务
     */
    @Bean(name = "jobDetail")
    public MethodInvokingJobDetailFactoryBean jobDetail(QuartzScheduledTasks quartzScheduledTasks) { // quartzScheduledTasks为需要执行的任务
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
//           是否并发执行
//           例如每5s执行一次任务，但是当前任务还没有执行完，就已经过了5s了，
//          如果此处为true，则下一个任务会执行，如果此处为false，则下一个任务会等待上一个任务执行完后，再开始执行
        jobDetail.setConcurrent(false);
        jobDetail.setName("srd-chhliu");// 设置任务的名字
        jobDetail.setGroup("srd");// 设置任务的分组，这些属性都可以存储在数据库中，在多任务的时候使用
        // 为需要执行的实体类对应的对象
        jobDetail.setTargetObject(quartzScheduledTasks);
        //test为需要执行的方法
        //通过这几个配置，告诉JobDetailFactoryBean我们需要执行定时执行ScheduleTask类中的sayHello方法
        jobDetail.setTargetMethod("synchronizeAj");
        return jobDetail;
    }

    /**
     * Details：配置定时任务的触发器，也就是什么时候触发执行定时任务
     */
    @Bean(name = "jobTrigger")
    public CronTriggerFactoryBean jobTrigger(JobDetail jobDetail) {
        CronTriggerFactoryBean tigger = new CronTriggerFactoryBean();
        tigger.setJobDetail(jobDetail);
        // 每天下午的 11点到11点59分(整点开始，每隔5分触发)
        tigger.setCronExpression("*/5 * * * * ?");// 初始时的cron表达式
        tigger.setName("srd-chhliu");// trigger的name

        return tigger;
    }

    // 配置警情定时任务
    @Bean(name = "jqDetail")
    public MethodInvokingJobDetailFactoryBean jqDetail(QuartzScheduledJQTasks quartzScheduledJQTasks) {
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        ////jobDetail.setName("srd-jq");// 设置任务的名字
        //jobDetail.setGroup("jq");// 设置任务的分组，这些属性都可以存储在数据库中，在多任务的时候使用

        // 是否并发执行
        jobDetail.setConcurrent(false);
        // 为需要执行的实体类对应的对象
        jobDetail.setTargetObject(quartzScheduledJQTasks);
        // 需要执行的方法
        jobDetail.setTargetMethod("synchronizeJq");
        return jobDetail;
    }

    // 配置警情触发器
    @Bean(name = "jqTrigger")
    public CronTriggerFactoryBean jqTrigger(JobDetail jqDetail) {
        CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
        trigger.setJobDetail(jqDetail);
        trigger.setName("jq");
        // cron表达式
        trigger.setCronExpression("*/5 * * * * ?");
        return trigger;
    }



    /**
     * Details：定义quartz调度工厂
     */
    @Bean(name = "scheduler")
    public SchedulerFactoryBean schedulerFactory(Trigger jobTrigger,Trigger jqTrigger) {
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        // 用于quartz集群,QuartzScheduler 启动时更新己存在的Job
        bean.setOverwriteExistingJobs(true);
        // 延时启动，应用启动1秒后
        bean.setStartupDelay(1);
        // 注册触发器
        bean.setTriggers(jobTrigger,jqTrigger);
        return bean;
    }

}
