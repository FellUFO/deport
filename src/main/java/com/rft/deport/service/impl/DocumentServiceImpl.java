package com.rft.deport.service.impl;

import com.rft.deport.dao.DocumentMasterMapper;
import com.rft.deport.dao.DocumentSlaveMapper;
import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.exception.DocuMentException;
import com.rft.deport.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentMasterMapper dmm;
    @Autowired
    DocumentSlaveMapper dsm;


    @Override
    public void insertDocument(DocumentMaster documentMaster, List<DocumentSlave> documentSlave) {
        int insert = dmm.insert(documentMaster);
        int i = dsm.insertListDocumentSlave(documentSlave);
        if (insert == 0 || i ==0) {
            throw new DocuMentException("添加单据失败");
        }
    }
}
