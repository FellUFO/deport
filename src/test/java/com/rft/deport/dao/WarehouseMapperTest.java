package com.rft.deport.dao;

import com.rft.deport.entity.Warehouse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class WarehouseMapperTest {

    @Autowired
    WarehouseMapper warehouseMapper;


    @Test
    void selectAllTest(){
        List<Warehouse> warehouses = warehouseMapper.selectAll();
        for (Warehouse warehouse : warehouses) {
            System.out.println("+++++"+warehouse+"________");
        }
    }
}