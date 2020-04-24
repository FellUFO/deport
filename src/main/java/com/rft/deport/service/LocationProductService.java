package com.rft.deport.service;

import com.rft.deport.entity.ProductLocation;

import java.util.List;

public interface LocationProductService {


    void insert(List<ProductLocation> pl);

    public List<ProductLocation> getAll();

}
