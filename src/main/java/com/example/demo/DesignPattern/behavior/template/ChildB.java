package com.example.demo.DesignPattern.behavior.template;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class ChildB extends Parent {

    @Override
    protected void hook() {
        System.out.println("Child B");
    }
}
