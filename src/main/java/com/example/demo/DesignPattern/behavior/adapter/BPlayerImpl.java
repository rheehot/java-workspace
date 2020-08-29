package com.example.demo.DesignPattern.behavior.adapter;

/**
 * @author Geonguk Han
 * @since 2020-07-09
 */
public class BPlayerImpl implements BPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("B player with " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("B player stop");

    }
}
