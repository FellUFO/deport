package com.rft.deport.controller;

import com.alibaba.fastjson.JSON;
import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.dto.MasterAndSlave;
import com.rft.deport.service.DocumentService;
import com.rft.deport.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        MasterAndSlave masterAndSlave = JSON.parseObject(content, MasterAndSlave.class);
        DocumentMaster documentMaster = masterAndSlave.getMaster();
        List<DocumentSlave> documentSlaves = masterAndSlave.getSlaves();
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

    @RequestMapping("/createListDocument")
    public String addListDocument(@RequestBody String content) {
        String result;
        System.out.println(content);
        List<MasterAndSlave> masterAndSlaves = JSON.parseArray(content, MasterAndSlave.class);
        for (MasterAndSlave masterAndSlave : masterAndSlaves) {
            System.out.println(masterAndSlave);
        }
        DocumentMaster documentMaster = new DocumentMaster();
        List<DocumentSlave> documentSlaves = new ArrayList<>();
        for (MasterAndSlave masterAndSlave : masterAndSlaves) {
            documentMaster = masterAndSlave.getMaster();
            documentSlaves = masterAndSlave.getSlaves();
            //增减产品数量
            productService.updateCount(documentMaster.getObject(),documentSlaves);
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

    /**
     * 获取当天所有在线产生的单据
     */
    @RequestMapping("/getDocumentByState")
    public List<MasterAndSlave> getDocumentByState() {
        List<MasterAndSlave> masterAndSlaves = new ArrayList<>();
        try {
            masterAndSlaves = documentService.selectDocumentByState2Day();
            for (MasterAndSlave masterAndSlave : masterAndSlaves) {

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return masterAndSlaves;
    }

}
