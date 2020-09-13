package com.example.demo.DesignPattern.GOFJava.abstractFactory.example2;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class CheapGPS extends GPS {
    @Override
    public Location findCurrentLocation() {
        System.out.println("find current location with cheap GPS");
        return null;
    }
}
