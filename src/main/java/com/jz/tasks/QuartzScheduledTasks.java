package com.jz.tasks;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class QuartzScheduledTasks {
    public void test() {
        System.out.println("我正在执行.."+System.currentTimeMillis());
    }

}
