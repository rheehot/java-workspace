package com.example.demo.DesignPattern.behavior.adapter;

/**
 * @author Geonguk Han
 * @since 2020-07-09
 */
public class PlayerAdapter implements APlayer {

    private BPlayer bPlayer;

    // 생성자로 주입
    public PlayerAdapter(BPlayer bPlayer) {
        this.bPlayer = bPlayer;
    }

    @Override
    public void play(String fileName) {
        bPlayer.play(fileName);

    }

    @Override
    public void stop() {
        bPlayer.stop();

    }
}
