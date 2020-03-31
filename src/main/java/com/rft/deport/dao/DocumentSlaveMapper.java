package com.rft.deport.dao;

import com.rft.deport.entity.DocumentSlave;

import java.util.List;

public interface DocumentSlaveMapper {
    int deleteByPrimaryKey(String id);

    int insert(DocumentSlave record);

    int insertSelective(DocumentSlave record);

    DocumentSlave selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DocumentSlave record);

    int updateByPrimaryKey(DocumentSlave record);

    int insertListDocumentSlave(List<DocumentSlave> list);
}