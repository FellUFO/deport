package com.rft.deport.service;

import com.rft.deport.entity.Product;
import org.springframework.stereotype.Service;


public interface ProductService {

    /**
     * 添加商品
     * @param product
     */
    void addProduct(Product product);


}
