package com.rft.deport.dto;

import com.rft.deport.entity.Location;
import com.rft.deport.entity.ProductLocation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class LocationUnit {

    private List<Location> list;

    private List<ProductLocation> locationAndProducts;

    private String messages;

    public LocationUnit() {

    }
}
