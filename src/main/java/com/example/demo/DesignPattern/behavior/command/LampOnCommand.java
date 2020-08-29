package com.example.demo.DesignPattern.behavior.command;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class LampOnCommand implements Command {

    private final Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void run() {
        lamp.turnOn();
    }
}
