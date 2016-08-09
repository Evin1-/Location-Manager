package com.example.locationtest;

import android.location.Location;

/**
 * Created by evin on 8/9/16.
 */
public class LocationEvent {
    public Location location;

    public LocationEvent(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public Double getLatitude() {
        return location.getLatitude();
    }

    public Double getLongitude() {
        return location.getLongitude();
    }
}
