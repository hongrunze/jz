package com.jz.service;

import com.jz.model.SchedulerConfig;

import java.util.List;

public interface ISchedulerConfigService {
    public List<SchedulerConfig> getSchedulerConfig(String key);

    public void updateSchedulerConfig(SchedulerConfig schedulerConfig);
}
