package com.rft.deport.entity;

import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ToString
public class DocumentMaster implements Serializable {

    private List<DocumentSlave> DocumentSlaves;

    private String orderId;

    private String object;

    private BigDecimal totalPrice;

    private Integer totalCount;

    private Date generate;

    private Integer operator;

    private Integer deportId;

    public List<DocumentSlave> getDocumentSlaves() {
        return DocumentSlaves;
    }

    public void setDocumentSlaves(List<DocumentSlave> documentSlaves) {
        DocumentSlaves = documentSlaves;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Date getGenerate() {
        return generate;
    }

    public void setGenerate(Date generate) {
        this.generate = generate;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Integer getDeportId() {
        return deportId;
    }

    public void setDeportId(Integer deportId) {
        this.deportId = deportId;
    }
}