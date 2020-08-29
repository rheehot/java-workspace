package com.example.demo.DesignPattern.behavior.decorator;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class AppTest {

    public static void main(String[] args) {
        final LettueDecorator lettueDecorator = new LettueDecorator(new Bread());
        lettueDecorator.make();

        System.out.println("===================================");

        final PickleDecorator pickleAndLettueDecorator = new PickleDecorator(new LettueDecorator(new Bread()));
        pickleAndLettueDecorator.make();


        System.out.println("===================================");

        final PickleDecorator pickleDecorator = new PickleDecorator(new Bread());
        pickleDecorator.make();

        System.out.println("===================================");

        final Bread bread = new Bread();
        bread.make();


    }
}
