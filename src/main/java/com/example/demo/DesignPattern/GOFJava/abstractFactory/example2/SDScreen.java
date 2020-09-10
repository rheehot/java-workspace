package com.example.demo.DesignPattern.GOFJava.abstractFactory.example2;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class SDScreen extends Screen {
    @Override
    public void drawMap(Map map) {
        System.out.println("draw map " + map.getClass().getName() + " on SD screen");
    }
}
