package com.rft.deport.controller;

import com.rft.deport.dto.LocationAndProducts;
import com.rft.deport.entity.Location;
import com.rft.deport.entity.Product;
import com.rft.deport.entity.ProductLocation;
import com.rft.deport.service.LocationProductService;
import com.rft.deport.service.LocationService;
import com.rft.deport.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    @Autowired
    LocationProductService locationProductService;

    /**
     * 获取当前所有商品和库位编码
     * @return map
     */
    @RequestMapping("/getLocationProduct")
    public Map getALL() {
        Map map = new HashMap();
        try {
            List<Location> locations = locationService.selectAll();
            List<Product> products = productService.selectAll();
            map.put("products", products);
            map.put("locations",locations);
            map.put("message","查询成功");
        } catch (Exception e) {
            map.put("message",e.getMessage());
        }
        return map;
    }

    /**
     * 插入商品和库位编码对应关系
     */
    @RequestMapping("/addProductLocation")
    public String addRelation(String product, String locals ) {
        String map = "";
        try {
            String[] split = locals.split(",");
            List<ProductLocation> lists = new ArrayList<>();
            for (String s : split) {
                ProductLocation productLocation = new ProductLocation();
                productLocation.setProductId(product);
                productLocation.setLocationNum(s);
                lists.add(productLocation);
            }
            locationProductService.insert(lists);
            map= "添加成功";
        } catch (Exception e) {
            map=e.getMessage();
            e.printStackTrace();
        }
        return map;
    }


    /**
     * 获取当前库位与商品对应关系
     */
    @RequestMapping("/gerProductAndLocation")
    public List<LocationAndProducts> getRelation() {
        List<LocationAndProducts> list = new ArrayList<>();
        try {
            List<ProductLocation> all = locationProductService.getAll();
            for (ProductLocation productLocation : all) {
                productLocation.getLocationNum();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    /**
     * 删除库位指定商品
     */
    @RequestMapping("/deleteLocationAndProduct")
    public String deleteItem(@RequestParam("pro_id")String proID,
                             @RequestParam("location_num")String locationNum) {
        String result="";
       try {
           locationProductService.removeItem(proID, locationNum);
           result = "删除成功";
       } catch (Exception e) {
           result = e.getMessage();
       }
        return result;
    }


}
