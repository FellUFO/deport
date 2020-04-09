package com.rft.deport.dto;

import com.rft.deport.entity.TakeMaster;

import java.util.List;

public class TakesUnit {

    private List<TakeMaster> list;

    private String messages;

    public TakesUnit() {

    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
