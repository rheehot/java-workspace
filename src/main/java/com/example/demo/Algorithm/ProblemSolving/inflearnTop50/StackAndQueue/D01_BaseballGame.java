package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.StackAndQueue;

import java.util.Stack;

/**
 * @since 2020-08-17
 */
public class D01_BaseballGame {

    public static void main(String[] args) {
        String[] strs = {"5", "-2", "4", "C", "D", "9", "+", "+"};

        System.out.println(solve(strs));
    }

    private static int solve(String[] strs) {
        Stack<Integer> stack = new Stack<>();

        for (String op : strs) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    // todo: something
                    int x = stack.pop();
                    int y = stack.pop();
                    int z = x + y;
                    stack.push(y);
                    stack.push(x);
                    stack.push(z);
                    break;

                default:
                    stack.push(Integer.parseInt(op));
            }
        }

        int result = 0;

        for (Integer integer : stack) {
            result += integer;
        }

        return result;

    }
}
