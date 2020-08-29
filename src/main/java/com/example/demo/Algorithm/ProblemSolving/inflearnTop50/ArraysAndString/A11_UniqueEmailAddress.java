package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.HashSet;
import java.util.Set;

/**
 * @since 2020-08-16
 */
public class A11_UniqueEmailAddress {
    public static void main(String[] args) {

        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        System.out.println(solve(emails)); // 2
    }

    private static int solve(String[] emails) {

        // 담을 그릇
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String local = makeLocalName(email);
            String domain = makeDomainName(email);

            String e = local + "@" + domain;
            set.add(e);
        }

        return set.size();
    }

    private static String makeDomainName(String email) {
        return email.substring(email.indexOf('@') + 1);
    }

    private static String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '.') {
                continue;
            }

            if (email.charAt(i) == '+') {
                break;
            }
            sb.append(email.charAt(i));
        }

        return sb.toString();
    }
}
