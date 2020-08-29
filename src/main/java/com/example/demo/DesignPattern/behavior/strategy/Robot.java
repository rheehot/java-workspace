package com.example.demo.DesignPattern.behavior.strategy;

/**
 * @author Geonguk Han
 * @since 2020-07-15
 * <p>
 * context 클래스
 */
public class Robot {

    private final AttackStrategy attackStrategy;

    // 원하는 AttackStategy를 생성해서 주입해 줄수 있다.
    public Robot(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        // delegate
        attackStrategy.attack();
    }

    public void move() {
        // todo: implement something

    }
}
