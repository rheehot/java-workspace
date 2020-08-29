package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

/**
 * @author Andrew
 * @since 2020-08-27
 */
public class TestApp implements Runnable {


    @Override
    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {


        Thread thread = new Thread(new TestApp());
        thread.start();
    }
}
