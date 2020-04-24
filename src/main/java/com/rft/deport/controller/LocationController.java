package com.rft.deport.controller;

import com.rft.deport.dto.LocationAndProducts;
import com.rft.deport.dto.LocationUnit;
import com.rft.deport.entity.Location;
import com.rft.deport.entity.ProductLocation;
import com.rft.deport.service.LocationProductService;
import com.rft.deport.service.LocationService;
import com.rft.deport.utils.LocationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liyi
 */
@RestController
@CrossOrigin
public class LocationController {

    @Autowired
    LocationService locationService;

    @Autowired
    LocationProductService locationProductService;
    @RequestMapping("/createLocation")
    public Map createLocation(int region, int shelf, int row, int column) {
        Map map = new HashMap();
        List<Location> locations = LocationUtil.getLocation(region, shelf, row, column);
        try {
            if (!locationService.selectAllToBoolean()) {
                locationService.dropAll();
            }
            locationService.insertAll(locations);
            map.put("message","添加成功");
        } catch (Exception e) {
            map.put("message", e.getMessage());
        }
        return map;
    }

    @RequestMapping("/getAllLocation")
    public LocationUnit getAllLocation() {
        LocationUnit locations = new LocationUnit();
        try {
            List<Location> list = locationService.selectAll();
            List<ProductLocation> productLocations = locationProductService.getAll();
            locations.setList(list);
            locations.setLocationAndProducts(productLocations);
            locations.setMessages("查询成功！");
        } catch (Exception e) {
            locations.setMessages("查询失败！");
        }
        return locations;
    }

}
