package com.example.demo.object.a07;

/**
 * @author Andrew
 * @since 2020-09-13
 */
public class HourlyEmployee extends Employee2 {
    public HourlyEmployee(String name, int basePay, int timeCard) {
        super(name, basePay, timeCard);
    }

    @Override
    public double calculatePay(double taxRate) {
        return (basePay * timeCard) - (basePay * timeCard) * taxRate;
    }

    @Override
    public int monthlyBasePay() {
        return 0;
    }
}
