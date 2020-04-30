package com.rft.deport.service.impl;

import com.rft.deport.dao.ProductLocationMapper;
import com.rft.deport.entity.ProductLocation;
import com.rft.deport.exception.LocationException;
import com.rft.deport.service.LocationProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationProductServiceImpl implements LocationProductService {

    @Autowired
    ProductLocationMapper plm;


    @Override
    public void insert(List<ProductLocation> pl) {
        plm.insertList(pl);
    }

    @Override
    public List<ProductLocation> getAll() {
        List<ProductLocation> locations = new ArrayList<>();
        locations = plm.selectAll();
        if (locations == null) {
            throw new LocationException("位置数据查找不到");
        }
        return locations;
    }

    @Override
    public void removeItem(String proID, String locationNum) {
        plm.deleteByNum(proID, locationNum);
    }

}
