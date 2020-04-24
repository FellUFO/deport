package com.rft.deport.dto;


import com.rft.deport.entity.Location;
import com.rft.deport.entity.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class LocationAndProducts {

    private Location location;

    private List<Product> products;

    private String message;

    public LocationAndProducts() {
    }

    public LocationAndProducts(Location locations, List<Product> products, String message) {
        this.location = locations;
        this.products = products;
        this.message = message;
    }
}
