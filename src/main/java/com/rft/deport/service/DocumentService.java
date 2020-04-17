package com.rft.deport.service;

import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.dto.MasterAndSlave;

import java.util.List;

public interface DocumentService {

    /**
     * 录入单据
     */
    void insertDocument(DocumentMaster documentMaster, List<DocumentSlave> documentSlave);

    List<MasterAndSlave> selectDocumentByState2Day();
}
