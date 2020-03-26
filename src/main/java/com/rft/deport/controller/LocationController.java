package com.rft.deport.controller;

import com.rft.deport.entity.Location;
import com.rft.deport.service.LocationService;
import com.rft.deport.utils.LocationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping("/createLocation")
    public Map createLocation(int region, int shelf, int row, int column) {
        Map map = new HashMap();
        List<Location> locations = LocationUtil.getLocation(region, shelf, row, column);
        try {
            if (!locationService.selectAll()) {
                locationService.dropAll();
            }
            locationService.insertAll(locations);
            map.put("message","添加成功");
        } catch (Exception e) {
            map.put("message", e.getMessage());
        }
        return map;
    }

}
