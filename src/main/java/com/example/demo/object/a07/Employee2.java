package com.example.demo.object.a07;

/**
 * @author Andrew
 * @since 2020-09-13
 */
public abstract class Employee2 {
    protected String name;
    protected int basePay;
    protected int timeCard;

    public Employee2(String name, int basePay, int timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.timeCard = timeCard;
    }

    public abstract double calculatePay(double taxRate);

    public abstract int monthlyBasePay();
}
