package com.example.demo.DesignPattern.behavior.decorator;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class LettueDecorator extends ToppingDecorator {
    public LettueDecorator(SandWitch sandWitch) {
        super(sandWitch);
    }

    @Override
    void make() {
        super.make();
        System.out.println("양상추 추가");
    }
}
