package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.StackAndQueue;

import java.util.Stack;

/**
 * @author Andrew
 * @since 2020-08-17
 */
public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        // push 담는다
        stack.push("andrew");
        stack.push("han");


        // pop 꺼낸다
        System.out.println(stack.pop());

        // 엿본다.
        System.out.println(stack.peek());

        // 사이즈 확인
        System.out.println(stack.size());

        // empty 체크 한다.
        System.out.println(stack.isEmpty());


    }
}
