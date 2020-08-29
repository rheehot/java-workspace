package com.example.demo.DesignPattern.behavior.decorator;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class PickleDecorator extends ToppingDecorator {
    public PickleDecorator(SandWitch sandWitch) {
        super(sandWitch);

    }

    @Override
    void make() {
        super.make();
        System.out.println("피클 추가");
    }
}
