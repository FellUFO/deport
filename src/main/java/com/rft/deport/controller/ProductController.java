package com.rft.deport.controller;

import com.rft.deport.entity.Product;
import com.rft.deport.service.ProductService;
import com.rft.deport.utils.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class ProductController {
    Map date = new HashMap();
    final String TAG = "message";
    @Autowired
    ProductService productServicel;

    @RequestMapping("/addProduct")
    public Map addProduct(Product product) {
        if (product == null) {
            date.put(TAG,"请重新输入！");
            return date;
        }
        try {
            String id = IDUtil.getID();
            product.setProductId(id);
            productServicel.addProduct(product);
            date.put(TAG,"添加成功");
        } catch (Exception e) {
            date.put(TAG,e.getMessage());
        }
        return date;
    }

}
