package com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.solution;

import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.Door;
import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.HyundaiDoor;
import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.HyundaiMotor;
import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.Motor;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class HyundaiElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }
}
