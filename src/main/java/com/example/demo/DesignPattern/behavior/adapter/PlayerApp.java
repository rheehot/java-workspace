package com.example.demo.DesignPattern.behavior.adapter;

/**
 * @author Geonguk Han
 * @since 2020-07-09
 */
public class PlayerApp {

    public static void main(String[] args) {
        APlayer aPlayer = new APlayerImpl();
        aPlayer.play("123.mp3");
        aPlayer.stop();


        // A player 계약기간 만료됨
        // B player를 통해서 Aplayer를 그대로 사용할 수 있다.
        APlayer playerAdapter = new PlayerAdapter(new BPlayerImpl());
        playerAdapter.play("123.mp3");

    }
}
