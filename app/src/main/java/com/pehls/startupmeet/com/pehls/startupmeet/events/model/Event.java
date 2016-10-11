package com.pehls.startupmeet.com.pehls.startupmeet.events.model;

import java.io.Serializable;

/**
 * Created by gabri on 02/10/2016.
 */

public class Event implements Serializable{
    private String event_id;
    private String title;
    private String description;
    private String details;
    private String ownerId;
    private String OwnerName;
    private String placeId;
    private String link;
    private String start;
    private String end;
    private String logoId;
    private String photoId;
    private Local location;
    private String addictionDate;
    private String mapId;

    public Event () {
        super();
    }

    public Event (String id, String title, String description, String start, String end, String logo, String cordinates, String address) {
        this.event_id = id;
        this.title = title;
        this.description = description;
        this.start = start;
        this.end = end;
        this.logoId = logo;
        this.location.setAddress(address);
        this.location.setLoc_coordinates(cordinates);

    }

    public String getEvent_id() {
        return event_id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getDetails() {
        return details;
    }
    public String getOwnerId() {
        return ownerId;
    }
    public String getOwnerName() {
        return OwnerName;
    }
    public String getPlaceId() {
        return placeId;
    }
    public String getLink() {
        return link;
    }
    public String getStart() {
        return start;
    }
    public String getEnd() {
        return end;
    }
    public String getLogoId() {
        return logoId;
    }
    public String getPhotoId() {
        return photoId;
    }
    public Local getLocation() {
        return location;
    }
    public String getAddictionDate() {
        return addictionDate;
    }
    public String getMapId() {
        return mapId;
    }
    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }
    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
    public void setLocation(Local location) {
        this.location = location;
    }
    public void setAddictionDate(String addictionDate) {
        this.addictionDate = addictionDate;
    }
    public void setMapId(String mapId) {
        this.mapId = mapId;
    }
}
