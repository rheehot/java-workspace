package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.StackAndQueue;

import java.util.Stack;

/**
 * @since 2020-08-17
 */
public class D02_ValidParenthese {
    public static void main(String[] args) {
//        String exp = "{}[]()";
//        String exp = "{[()]}";
//        String exp = "[(])";
        String exp = "[{})]";

        System.out.println(solve(exp));
    }

    private static boolean solve(String exp) {
        if (exp.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            switch (exp.charAt(i)) {
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                        break;
                    }
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        break;
                    }

                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        break;
                    }

                default:
                    stack.push(exp.charAt(i));
            }
        }

        return stack.empty();
    }
}
