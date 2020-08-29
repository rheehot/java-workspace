package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.Graph;

import java.util.Stack;

/**
 * @author Andrew
 * @since 2020-08-26
 */
public class A06_RemoveInvalidParenthes {

    public static void main(String[] args) {

        String str = "())(";
        System.out.println(isValid(str));

        String text = "012345";
        System.out.println(text.substring(0, 3)); // 012
        System.out.println(text.substring(3));// 345

        String newString = "()(a)";

        char[] chars = newString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '(' && chars[i] != ')') continue;
            stringBuilder.append(chars[i]);

        }
        System.out.println(stringBuilder.toString());
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();

    }
}
