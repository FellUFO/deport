package com.rft.deport.service.impl;

import com.rft.deport.dao.DocumentMasterMapper;
import com.rft.deport.dao.DocumentSlaveMapper;
import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.dto.MasterAndSlave;
import com.rft.deport.exception.DocuMentException;
import com.rft.deport.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public List<MasterAndSlave> selectDocumentByState2Day() {
        List<MasterAndSlave> masterAndSlaves = new ArrayList<>();
        List<DocumentMaster> masters = dmm.selectByDate();
        for (DocumentMaster master : masters) {
            //根据master_id去查询slave
//            System.out.println(master.getOrderId());
            List<DocumentSlave> slaves = dsm.selectByMasterID(master.getOrderId());
            if (slaves.isEmpty()) {
                throw new DocuMentException("未能查询到单据");
            }
            MasterAndSlave masterAndSlave = new MasterAndSlave();
            masterAndSlave.setMaster(master);
            masterAndSlave.setSlaves(slaves);
            masterAndSlaves.add(masterAndSlave);
        }
        return masterAndSlaves;
    }
}
