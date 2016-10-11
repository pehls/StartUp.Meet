package com.pehls.startupmeet.com.pehls.startupmeet.events.model;

import java.io.Serializable;

/**
 * Created by gabri on 02/10/2016.
 */

public class Local implements Serializable{
    private String type;
    private String placeId;
    private String loc_coordinates;
    private String loc_type;
    private String address;
    public Local () {
        super();
    }

    public String getType() {
        return type;
    }
    public String getPlaceId() {
        return placeId;
    }
    public String getLoc_coordinates() {
        return loc_coordinates;
    }
    public String getLoc_type() {
        return loc_type;
    }
    public String getAddress() {
        return address;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    public void setLoc_coordinates(String loc_coordinates) {
        this.loc_coordinates = loc_coordinates;
    }
    public void setLoc_type(String loc_type) {
        this.loc_type = loc_type;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
