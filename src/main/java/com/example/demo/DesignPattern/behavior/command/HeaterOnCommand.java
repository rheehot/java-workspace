package com.example.demo.DesignPattern.behavior.command;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class HeaterOnCommand implements Command {
    private Heater heater;

    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void run() {
        heater.powerOn();
    }
}
