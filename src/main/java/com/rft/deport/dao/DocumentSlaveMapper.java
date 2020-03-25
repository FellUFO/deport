package com.rft.deport.dao;

import com.rft.deport.entity.DocumentSlave;

public interface DocumentSlaveMapper {
    int deleteByPrimaryKey(String id);

    int insert(DocumentSlave record);

    int insertSelective(DocumentSlave record);

    DocumentSlave selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DocumentSlave record);

    int updateByPrimaryKey(DocumentSlave record);
}