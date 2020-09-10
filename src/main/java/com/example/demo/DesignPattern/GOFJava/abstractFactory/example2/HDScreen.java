package com.example.demo.DesignPattern.GOFJava.abstractFactory.example2;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class HDScreen extends Screen {
    @Override
    public void drawMap(Map map) {
        System.out.println("draw map " + map.getClass().getName() + " on HD screen");
    }
}
