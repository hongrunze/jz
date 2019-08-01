package com.jz.model;

public class SchedulerConfig {
    private Integer id;

    private String cron;

    public SchedulerConfig(Integer id, String cron) {
        this.id = id;
        this.cron = cron;
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
}