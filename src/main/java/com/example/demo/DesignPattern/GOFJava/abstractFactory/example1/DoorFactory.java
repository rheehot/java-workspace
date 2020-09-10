package com.example.demo.DesignPattern.GOFJava.abstractFactory.example1;

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
