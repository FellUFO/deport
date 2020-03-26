package com.rft.deport.dao;

import com.rft.deport.entity.TakeMaster;

public interface TakeMasterMapper {
    int deleteByPrimaryKey(String taskId);

    int insert(TakeMaster record);

    int insertSelective(TakeMaster record);

    TakeMaster selectByPrimaryKey(String taskId);

    int updateByPrimaryKeySelective(TakeMaster record);

    int updateByPrimaryKey(TakeMaster record);
}