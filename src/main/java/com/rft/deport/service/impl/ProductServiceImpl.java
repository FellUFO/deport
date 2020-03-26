package com.rft.deport.service.impl;

import com.rft.deport.dao.ProductMapper;
import com.rft.deport.entity.Product;
import com.rft.deport.exception.ProductException;
import com.rft.deport.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public void addProduct(Product product) {
        int index = productMapper.insert(product);
        if (index != 1){
            throw new ProductException("添加商品失败");
        }
    }
}
