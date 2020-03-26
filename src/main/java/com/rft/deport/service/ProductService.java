package com.rft.deport.service;

import com.rft.deport.entity.Product;

import java.util.List;


public interface ProductService {

    /**
     * 添加商品
     * @param product
     */
    void addProduct(Product product);


    List<Product> selectAll();
}
