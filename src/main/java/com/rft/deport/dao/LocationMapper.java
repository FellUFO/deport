package com.rft.deport.dao;

import com.rft.deport.entity.Location;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LocationMapper {
    int deleteByPrimaryKey(String locationNumber);

    int insert(Location record);

    int insertSelective(Location record);

    Location selectByPrimaryKey(String locationNumber);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);

    int insertAll(List<Location> locations);

    int deleteAll();

    List<Location> select();
}