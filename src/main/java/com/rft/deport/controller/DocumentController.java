package com.rft.deport.controller;

import com.alibaba.fastjson.JSON;
import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.service.DocumentService;
import com.rft.deport.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DocumentController {

    @Autowired
    DocumentService documentService;
    @Autowired
    ProductService productService;


    @RequestMapping("/createDocument")
    public String addDocument(@RequestBody String content) {
        String result;
        DocumentMaster documentMaster = JSON.parseObject(content, DocumentMaster.class);
//        System.out.println(documentMaster);
        List<DocumentSlave> documentSlaves = documentMaster.getDocumentSlaves();
        //增减产品数量
        productService.updateCount(documentMaster.getObject(),documentSlaves);
        if (documentMaster == null || documentSlaves.isEmpty()) {
            result = "数据为空";
        }
        try {
            documentService.insertDocument(documentMaster, documentSlaves);
            result = "操作成功";
        } catch (Exception e) {
            result = "操作失败";
            e.printStackTrace();
        }
        return result;
    }


}
