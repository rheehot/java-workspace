package com.example.demo.DesignPattern.creation.abstractFactory;

/**
 * @author Geonguk Han
 * @since 2020-09-02
 */
public abstract class Door {
    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    // 템플릿 메서드
    public void close() {
        if (doorStatus == DoorStatus.CLOSED) {
            return;
        }

        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doClose();

    public void open() {
        if (doorStatus == DoorStatus.OPEN) {
            return;
        }
        doOpen();
        doorStatus = DoorStatus.OPEN;
    }

    protected abstract void doOpen();
}
