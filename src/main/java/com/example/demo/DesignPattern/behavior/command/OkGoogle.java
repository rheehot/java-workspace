package com.example.demo.DesignPattern.behavior.command;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class OkGoogle {
    private Command command;

    public OkGoogle(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void talk() {
        command.run();
    }
}
