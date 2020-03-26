package com.rft.deport.service;

import com.rft.deport.entity.Location;

import java.util.List;

public interface LocationService {


    void insertAll(List<Location> locations);

    void dropAll();

    List<Location> selectAll();

    boolean selectAllToBoolean();
}
