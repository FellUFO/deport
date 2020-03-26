package com.rft.deport.controller;

import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DocumentController {

    @Autowired
    DocumentService documentService;


    @RequestMapping("/addDocument")
    public Map addDocument(DocumentMaster dm, List<DocumentSlave> ds) {
        Map map = new HashMap();
        try {
            documentService.insertDocument(dm, ds);
            map.put("message","添加成功");
        } catch (Exception e) {
            map.put("message",e.getMessage());
        }
        return map;
    }

}
