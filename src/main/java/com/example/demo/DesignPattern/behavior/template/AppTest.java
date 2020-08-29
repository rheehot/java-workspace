package com.example.demo.DesignPattern.behavior.template;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class AppTest {

    public static void main(String[] args) {
        final Parent childA = new ChildA();
        childA.someMethod();

        System.out.println("===============");

        final ChildB childB = new ChildB();
        childB.someMethod();

    }
}
