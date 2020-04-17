package com.rft.deport.dto;

import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import lombok.ToString;

import java.util.List;

@ToString
public class MasterAndSlave {

    private DocumentMaster master;
    private List<DocumentSlave> slaves;

    public DocumentMaster getMaster() {
        return master;
    }

    public void setMaster(DocumentMaster master) {
        this.master = master;
    }

    public List<DocumentSlave> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<DocumentSlave> slaves) {
        this.slaves = slaves;
    }
}
