package com.example.demo.object.a07;

/**
 * @author Andrew
 * @since 2020-09-13
 */
public class AppTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("직원A", 400, false, 0);
        Employee employee2 = new Employee("직원B", 300, false, 0);
        Employee employee3 = new Employee("직원C", 250, false, 0);
        Employee employee4 = new Employee("아르바이트D", 1, true, 120);
        Employee employee5 = new Employee("아르바이트E", 1, true, 120);
        Employee employee6 = new Employee("아르바이트F", 1, true, 120);

        System.out.println(employee1.calculatePay(0.01));


    }
}
