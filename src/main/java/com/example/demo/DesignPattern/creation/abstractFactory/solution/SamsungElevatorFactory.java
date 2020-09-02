package com.example.demo.DesignPattern.creation.abstractFactory.solution;

import com.example.demo.DesignPattern.creation.abstractFactory.Door;
import com.example.demo.DesignPattern.creation.abstractFactory.Motor;
import com.example.demo.DesignPattern.creation.abstractFactory.SamsungDoor;
import com.example.demo.DesignPattern.creation.abstractFactory.SamsungMotor;

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
