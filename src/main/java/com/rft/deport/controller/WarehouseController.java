package com.rft.deport.controller;

import com.rft.deport.entity.Warehouse;
import com.rft.deport.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class WarehouseController {
    final String TAG = "message";
    Map map = new HashMap();


    @Autowired
    WarehouseService warehouseService;

    @RequestMapping("/getAllWarehouse")
    public Map getWarehouse(){
        try {
            List<Warehouse> warehouseList = warehouseService.getAll();
            map.put("data",warehouseList);
        } catch (Exception e) {
            map.put(TAG,e.getMessage());
        }
        return map;
    }
}
