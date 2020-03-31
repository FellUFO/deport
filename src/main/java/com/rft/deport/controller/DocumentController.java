package com.rft.deport.controller;

import com.alibaba.fastjson.JSON;
import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DocumentController {

    @Autowired
    DocumentService documentService;

//    {"documentSlaves":[{"count":11,"masterId":"20200331164924QK","productId":"3C6B5E4A47F54CCBB58BB8C1B0CB4982"},{"count":11,"masterId":"20200331164950WI","productId":"3C6B5E4A47F54CCBB58BB8C1B0CB4989"}],
//        "documentMaster":{"deportId":1,"generate":"Mar 31, 2020 16:49:50","object":"入库","operator":1}}

    @RequestMapping("/createDocument")
    public Map addDocument(@RequestBody String content) {
        System.out.println(content);
        Map map = new HashMap();
        Map<String, Object> dataMap= (Map) JSON.parse(content);
        List<DocumentSlave> documentSlaves = (List<DocumentSlave>) dataMap.get("documentSlaves");
        for (DocumentSlave documentSlave : documentSlaves) {
            System.out.println(documentSlave.toString());
        }
//        System.out.println(documentMaster);
//        if (documentMaster == null || documentSlaves.isEmpty()) {
//            map.put("message","数据为空");
//        }
//        try {
//            documentService.insertDocument(documentMaster, documentSlaves);
//            map.put("message","添加成功");
//        } catch (Exception e) {
//            map.put("message",e.getMessage());
//        }
        return map;
    }

}
