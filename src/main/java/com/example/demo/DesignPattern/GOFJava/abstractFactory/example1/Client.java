package com.example.demo.DesignPattern.GOFJava.abstractFactory.example1;

import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.solution.ElevatorFactory;
import com.example.demo.DesignPattern.GOFJava.abstractFactory.example1.solution.LGElevatorFactory;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public class Client {
    public static void main(String[] args) {



//        final Door lgDoor = DoorFactory.createDoor(VendorID.LG);
//        final Motor lgMotor = MotorFactory.createMotor(VendorID.LG);
//
//        lgMotor.setDoor(lgDoor);
//        lgDoor.open();

        ElevatorFactory factory = new LGElevatorFactory();
        final Door lgDoor = factory.createDoor();
        final Motor lgMotor = factory.createMotor();

        //삼성 부품 업체가 추가되어도,

    }
}
