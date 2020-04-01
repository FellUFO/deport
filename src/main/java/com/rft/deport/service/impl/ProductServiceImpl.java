package com.rft.deport.service.impl;

import com.rft.deport.dao.ProductMapper;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.entity.Product;
import com.rft.deport.exception.ProductException;
import com.rft.deport.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Product> selectAll() {

        List<Product> products = productMapper.selectAll();
        if (products.isEmpty()) {
            throw new ProductException("查询商品失败");
        }
        return products;
    }

    @Override
    public void updateCount(String obj, List<DocumentSlave> documentSlaves) {
        int i = 0;
        if ("入库".equals(obj)) {
            i = productMapper.updateAddCount(documentSlaves);
        } else if ("出库".equals(obj)) {
            i = productMapper.updateReduceCount(documentSlaves);
        }
        if (i == 0) {
            throw new ProductException("更新商品数量失败！");
        }
    }



}
