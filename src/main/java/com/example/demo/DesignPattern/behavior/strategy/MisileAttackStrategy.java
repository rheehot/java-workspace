package com.example.demo.DesignPattern.behavior.strategy;

/**
 * @author Geonguk Han
 * @since 2020-07-15
 */
public class MisileAttackStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("미사일 공격");
    }
}
