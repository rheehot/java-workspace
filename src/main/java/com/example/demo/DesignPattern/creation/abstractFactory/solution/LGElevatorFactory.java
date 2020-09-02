package com.example.demo.DesignPattern.creation.abstractFactory.solution;

import com.example.demo.DesignPattern.creation.abstractFactory.Door;
import com.example.demo.DesignPattern.creation.abstractFactory.HyundaiDoor;
import com.example.demo.DesignPattern.creation.abstractFactory.LGMotor;
import com.example.demo.DesignPattern.creation.abstractFactory.Motor;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class LGElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }

}
