package com.example.demo.object.a07;

/**
 * @author Andrew
 * @since 2020-09-13
 * <p>
 * 추상데이터 타입
 * Operation별로 타입을 구분한다.
 * 앞으로 operation이 추가된다면 추상데이터 타입을 고려하라
 * 그게 아니라면 -> 객체지향을 고려하라
 */
public class Employee {

    private String name;
    private int basePay;
    private boolean hourly;
    private int timeCard;

    public Employee(String name, int basePay, boolean hourly, int timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.hourly = hourly;
        this.timeCard = timeCard;
    }

    public double calculatePay(double taxRate) {
        if (hourly) return calculateHolurlyPay(taxRate);
        return calculateSalariedPay(taxRate);
    }

    private double calculateSalariedPay(double taxRate) {
        return basePay - (basePay * taxRate);
    }

    private double calculateHolurlyPay(double taxRate) {
        return (basePay * timeCard) - (basePay * timeCard) * taxRate;
    }

    public int monthlyBasePay() {
        if (hourly) return 0;
        return basePay;
    }
}
