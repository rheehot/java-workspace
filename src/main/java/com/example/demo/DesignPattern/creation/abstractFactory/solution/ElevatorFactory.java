package com.example.demo.DesignPattern.creation.abstractFactory.solution;

import com.example.demo.DesignPattern.creation.abstractFactory.Door;
import com.example.demo.DesignPattern.creation.abstractFactory.Motor;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public abstract class ElevatorFactory {
    public abstract Motor createMotor();

    public abstract Door createDoor();
}
