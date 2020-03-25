package com.rft.deport.dao;

import com.rft.deport.entity.Location;

public interface LocationMapper {
    int deleteByPrimaryKey(String locationNumber);

    int insert(Location record);

    int insertSelective(Location record);

    Location selectByPrimaryKey(String locationNumber);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
}