package com.example.demo.DesignPattern.creation.abstractFactory;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class HyundaiDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("close Hyundai Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open Hyundai Door");
    }
}
