package com.rft.deport.dao;

import com.rft.deport.entity.DocumentMaster;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocumentMasterMapper {

    int deleteByPrimaryKey(String orderId);

    int insert(DocumentMaster record);

    int insertSelective(DocumentMaster record);

    DocumentMaster selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(DocumentMaster record);

    int updateByPrimaryKey(DocumentMaster record);

    List<DocumentMaster> selectByDate();
}