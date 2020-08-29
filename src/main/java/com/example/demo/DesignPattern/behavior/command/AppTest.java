package com.example.demo.DesignPattern.behavior.command;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class AppTest {

    public static void main(String[] args) {

        final Command heaterOnCommand = new HeaterOnCommand(new Heater());
        final OkGoogle okGoogle = new OkGoogle(heaterOnCommand);

        final Command lampOnCommand = new LampOnCommand(new Lamp());

        okGoogle.talk();

        // command를 다른걸로 갈아끼울 수 있다.
        okGoogle.setCommand(lampOnCommand);
        okGoogle.talk();

    }
}
