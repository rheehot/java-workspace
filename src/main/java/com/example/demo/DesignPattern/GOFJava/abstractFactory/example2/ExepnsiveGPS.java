package com.example.demo.DesignPattern.GOFJava.abstractFactory.example2;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class ExepnsiveGPS extends GPS {
    @Override
    public Location findCurrentLocation() {
        System.out.println("find current location with Expensive GPS");
        return null;
    }
}
