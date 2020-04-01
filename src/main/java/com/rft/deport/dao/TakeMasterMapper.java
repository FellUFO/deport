package com.rft.deport.dao;

import com.rft.deport.entity.TakeMaster;

import java.util.List;

public interface TakeMasterMapper {
    int deleteByPrimaryKey(String taskId);

    int insert(TakeMaster record);

    int insertSelective(TakeMaster record);

    TakeMaster selectByPrimaryKey(String taskId);

    int updateByPrimaryKeySelective(TakeMaster record);

    int updateByPrimaryKey(TakeMaster record);

    List<TakeMaster> selectByState();
}