package com.example.demo.DesignPattern.behavior.adapter;

/**
 * @author Geonguk Han
 * @since 2020-07-09
 */
public class APlayerImpl implements APlayer {
    @Override
    public void play(String fileName) {
        System.out.println("A player with " + fileName);

    }

    @Override
    public void stop() {
        System.out.println("A player stop ");
    }
}
