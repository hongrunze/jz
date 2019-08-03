package com.jz.model;

import java.util.Date;

public class SchedulerConfig {
    private Integer id;

    private String cron;

    private String triggerName;

    private Date startTime;

    private Integer numRow;

    public SchedulerConfig(Integer id, String cron, String triggerName, Date startTime, Integer numRow) {
        this.id = id;
        this.cron = cron;
        this.triggerName = triggerName;
        this.startTime = startTime;
        this.numRow = numRow;
    }

    public SchedulerConfig() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName == null ? null : triggerName.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getNumRow() {
        return numRow;
    }

    public void setNumRow(Integer numRow) {
        this.numRow = numRow;
    }
}