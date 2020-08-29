package com.example.demo.Algorithm.algorithmn.recursion;

public class Recursion {

    /**
     * recursion
     */
    /*public static int factorial(int n){
        if (n == 1) return 1;
        else {
            return n * factorial(n -1);
        }
    }*/

    /**
     * tail recursion
     */
    public static int tailFactorial(int n, int acc) {
        if (n == 1) {
            return acc;
        } else {
            return tailFactorial(n - 1, acc * n);
        }
    }

    public static int factorial(int n) {
        return tailFactorial(n, 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));


    }
}
