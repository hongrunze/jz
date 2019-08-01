package com.jz.service.impl;

import com.jz.dao.SchedulerConfigMapper;
import com.jz.model.SchedulerConfig;
import com.jz.model.SchedulerConfigExample;
import com.jz.service.ISchedulerConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("schedulerConfigService")
public class SchedulerConfigService implements ISchedulerConfigService {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerConfigService.class);

    @Autowired
    private SchedulerConfigMapper schedulerConfigMapper;

    public List<SchedulerConfig> getSchedulerConfig(){
        SchedulerConfigExample schedulerConfigExample=new SchedulerConfigExample();
        return schedulerConfigMapper.selectByExample(schedulerConfigExample);
    }
}
