package com.example.demo.DesignPattern.behavior.decorator;

/**
 * @author Geonguk Han
 * @since 2020-07-16
 */
public class ToppingDecorator extends SandWitch {

    private SandWitch sandWitch;

    public ToppingDecorator(SandWitch sandWitch) {
        this.sandWitch = sandWitch;
    }

    @Override
    void make() {
        // 이게 핵심
        // 토핑 Decorator도 추상클래스의 메서드를 호출하면서 Decorator 패턴을 만들 수 있다.
        sandWitch.make();

    }
}
