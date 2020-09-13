package com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.solution;

import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.Door;
import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.Motor;
import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.SamsungDoor;
import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.SamsungMotor;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class SamsungElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }

    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}
