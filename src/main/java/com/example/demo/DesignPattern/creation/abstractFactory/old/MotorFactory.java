package com.example.demo.DesignPattern.creation.abstractFactory.old;

import com.example.demo.DesignPattern.creation.abstractFactory.HyundaiMotor;
import com.example.demo.DesignPattern.creation.abstractFactory.LGMotor;
import com.example.demo.DesignPattern.creation.abstractFactory.Motor;
import com.example.demo.DesignPattern.creation.abstractFactory.VendorID;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */

// 팩토리 메서드 패턴을 사용
public class MotorFactory {

    public static Motor createMotor(VendorID vendorID) {
        Motor motor = null;
        switch (vendorID) {
            case LG:
                motor = new LGMotor();
                break;

            case HYUNDAI:
                motor = new HyundaiMotor();
                break;

        }
        return motor;
    }

}
