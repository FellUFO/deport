package com.rft.deport.dao;

import com.rft.deport.entity.ProductLocation;

public interface ProductLocationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductLocation record);

    int insertSelective(ProductLocation record);

    ProductLocation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductLocation record);

    int updateByPrimaryKey(ProductLocation record);
}