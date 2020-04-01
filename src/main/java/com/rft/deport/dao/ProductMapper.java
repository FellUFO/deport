package com.rft.deport.dao;

import com.rft.deport.entity.DocumentMaster;
import com.rft.deport.entity.DocumentSlave;
import com.rft.deport.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(String productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectAll();

    int updateAddCount(List<DocumentSlave> documentSlaves);

    int updateReduceCount(List<DocumentSlave> documentSlaves);
}