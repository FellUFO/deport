package com.rft.deport.entity;

public class Location {
    private String locationNumber;

    public String getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(String locationNumber) {
        this.locationNumber = locationNumber == null ? null : locationNumber.trim();
    }
}