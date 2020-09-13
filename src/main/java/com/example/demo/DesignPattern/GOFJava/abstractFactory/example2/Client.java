package com.example.demo.DesignPattern.GOFJava.abstractFactory.example2;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class Client {
    public static void main(String[] args) {
        final GPS gps = new CheapGPS();
        final Screen mapScreen = new SDScreen();
        PathFinder pathFinder = new SlowPathFinder();

        final Map map = new SmallMap();
        mapScreen.drawMap(map);

        final Location from = gps.findCurrentLocation();
        final Location to = gps.findCurrentLocation();

        pathFinder.findPath(from, to);
    }
}
