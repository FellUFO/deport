package com.rft.deport.service.impl;

import com.rft.deport.dao.WarehouseMapper;
import com.rft.deport.entity.Warehouse;
import com.rft.deport.exception.WarehouseException;
import com.rft.deport.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> getAll() {
        List<Warehouse> warehouses = warehouseMapper.selectAll();
        if (warehouses.isEmpty()){
            throw new WarehouseException("查询仓库异常");
        }
        return warehouses;
    }
}
