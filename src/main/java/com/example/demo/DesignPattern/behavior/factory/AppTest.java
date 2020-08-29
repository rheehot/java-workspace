package com.example.demo.DesignPattern.behavior.factory;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class AppTest {

    public static void main(String[] args) {

        final ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("B");
    }
}
