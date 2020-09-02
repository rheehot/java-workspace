package com.example.demo.DesignPattern.creation.abstractFactory.old;

import com.example.demo.DesignPattern.creation.abstractFactory.Door;
import com.example.demo.DesignPattern.creation.abstractFactory.HyundaiDoor;
import com.example.demo.DesignPattern.creation.abstractFactory.LGDoor;
import com.example.demo.DesignPattern.creation.abstractFactory.VendorID;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
// 문제점은 삼성업체가 추가된다면, 여기에 새롭게 추가해야 한다.
public class DoorFactory {

    public static Door createDoor(VendorID vendorID) {
        Door door = null;
        switch (vendorID) {
            case LG:
                door = new LGDoor();
                break;
            case HYUNDAI:
                door = new HyundaiDoor();
                break;

        }
        return door;
    }
}
