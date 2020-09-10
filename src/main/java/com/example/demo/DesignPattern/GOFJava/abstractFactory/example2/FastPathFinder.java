package com.example.demo.DesignPattern.GOFJava.abstractFactory.example2;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class FastPathFinder extends PathFinder {
    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Fast path finder");
        return null;
    }
}
