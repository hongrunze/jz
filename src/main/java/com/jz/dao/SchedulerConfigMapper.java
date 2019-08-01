package com.jz.dao;

import com.jz.model.SchedulerConfig;
import com.jz.model.SchedulerConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulerConfigMapper {
    int countByExample(SchedulerConfigExample example);

    int deleteByExample(SchedulerConfigExample example);

    int insert(SchedulerConfig record);

    int insertSelective(SchedulerConfig record);

    List<SchedulerConfig> selectByExample(SchedulerConfigExample example);

    int updateByExampleSelective(@Param("record") SchedulerConfig record, @Param("example") SchedulerConfigExample example);

    int updateByExample(@Param("record") SchedulerConfig record, @Param("example") SchedulerConfigExample example);
}