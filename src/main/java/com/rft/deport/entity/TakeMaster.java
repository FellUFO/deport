package com.rft.deport.entity;

import java.util.List;

public class TakeMaster {
    private String taskId;

    private Integer state;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<TakeSlave> slaves;

    public List<TakeSlave> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<TakeSlave> slaves) {
        this.slaves = slaves;
    }
}