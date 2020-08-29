package com.example.demo.DesignPattern.behavior.factory;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class TypeFactory {

    public static Type createType(String type) {
        switch (type) {
            case "A":
                return new TypeA();
            case "B":
                return new TypeB();

        }

        return null;
    }
}
