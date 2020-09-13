package com.example.demo.object.a07;

/**
 * @author Andrew
 * @since 2020-09-13
 */
public class SalaryEmployee extends Employee2 {
    public SalaryEmployee(String name, int basePay, int timeCard) {
        super(name, basePay, timeCard);
    }

    @Override
    public double calculatePay(double taxRate) {
        return basePay - (basePay * taxRate);
    }

    @Override
    public int monthlyBasePay() {
        return basePay;
    }
}
