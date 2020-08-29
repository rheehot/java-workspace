package com.example.demo.DesignPattern.behavior.factory;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class ClassA {

    public Type createType(String type) {
        return TypeFactory.createType(type);
    }

}
