package com.rft.deport.dao;

import com.rft.deport.entity.TakeSlave;

import java.util.List;

public interface TakeSlaveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TakeSlave record);

    int insertSelective(TakeSlave record);

    TakeSlave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TakeSlave record);

    int updateByPrimaryKey(TakeSlave record);

    List<TakeSlave> selectByMasterID(String taskId);
}