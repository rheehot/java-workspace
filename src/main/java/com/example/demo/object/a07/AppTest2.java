package com.example.demo.object.a07;

/**
 * @author Andrew
 * @since 2020-09-13
 */
public class AppTest2 {

    public static void main(String[] args) {
        Employee2 employee1 = new SalaryEmployee("직원A", 200, 0);
        Employee2 employee2 = new SalaryEmployee("직원B", 300, 0);
        Employee2 employee3 = new HourlyEmployee("아르바이트C", 1, 120);

        System.out.println(employee1.calculatePay(0.9));
        System.out.println(employee3.calculatePay(0.9));

    }
}
