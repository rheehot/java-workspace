package com.example.demo.DesignPattern.behavior.strategy;

/**
 * @author Geonguk Han
 * @since 2020-07-15
 */
public class AppTest {

    public static void main(String[] args) {

        AttackStrategy punchAttack = new PunchAttackStrategy();

        final Robot robot = new Robot(punchAttack);

        robot.attack();

    }
}
