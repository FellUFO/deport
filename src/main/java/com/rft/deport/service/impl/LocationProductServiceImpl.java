package com.rft.deport.service.impl;

import com.rft.deport.dao.ProductLocationMapper;
import com.rft.deport.entity.ProductLocation;
import com.rft.deport.service.LocationProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationProductServiceImpl implements LocationProductService {

    @Autowired
    ProductLocationMapper plm;

    @Override
    public void insert(List<ProductLocation> pl) {
        plm.insertList(pl);
    }
}
