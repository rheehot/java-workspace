package com.example.demo.DesignPattern.behavior.template;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class Parent {

    public void someMethod() {
        System.out.println("부모에서 실행하는 부분 상");


        hook();

        System.out.println("부모에서 실행하는 부분 하");


    }

    protected void hook() {
    }
}
