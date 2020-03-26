package com.rft.deport.controller;

import com.rft.deport.entity.Location;
import com.rft.deport.entity.Product;
import com.rft.deport.service.LocationService;
import com.rft.deport.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class LocationProductController {

    @Autowired
    ProductService productService;
    @Autowired
    LocationService locationService;


    @RequestMapping("/getlocationProduct")
    public Map getALL() {
        Map map = new HashMap();
        try {
            List<Product> products = productService.selectAll();
            List<Location> locations = locationService.selectAll();
            map.put("products", products);
            map.put("locations",locations);
            map.put("message","查询成功");
        } catch (Exception e) {
            map.put("message",e.getMessage());
        }
        return map;
    }

}
