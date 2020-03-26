package com.rft.deport.service.impl;

import com.rft.deport.dao.LocationMapper;
import com.rft.deport.entity.Location;
import com.rft.deport.exception.LocationException;
import com.rft.deport.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationMapper locationMapper;


    @Override
    public void insertAll(List<Location> locations) {
        int i = locationMapper.insertAll(locations);
        if (i == 0) {
            throw new LocationException("添加库位失败");
        }
    }

    @Override
    public void dropAll() {
        int i = locationMapper.deleteAll();
        if (i == 0) {
            throw new LocationException("删除库位失败");
        }
    }

    @Override
    public List<Location> selectAll() {
        List<Location> select = locationMapper.select();
        if (select.isEmpty()) {
           throw new LocationException("查询库位为空");
        }
        return select;
    }

    @Override
    public boolean selectAllToBoolean() {
        boolean bool = false;
        List<Location> select = locationMapper.select();
        if (select.isEmpty()) {
            bool = true;
        }
        return bool;
    }
}
