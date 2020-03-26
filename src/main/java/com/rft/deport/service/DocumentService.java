package com.rft.deport.service;

import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;

import java.util.List;

public interface DocumentService {

    /**
     * 录入单据
     */
    void insertDocument(DocumentMaster documentMaster, List<DocumentSlave> documentSlave);

}
