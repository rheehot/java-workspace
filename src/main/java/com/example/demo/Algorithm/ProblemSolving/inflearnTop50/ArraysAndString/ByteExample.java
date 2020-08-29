package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

/**
 * @author Andrew
 * @since 2020-08-26
 */
public class ByteExample {

    public static void main(String[] args) {

        byte a = 'A';
        byte zero = '0';
        char aa = 'A';

        System.out.println(a);
        System.out.println(zero);
        System.out.println(aa);

        String str = "Hello World";

        byte[] bytes = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bytes[i] = (byte) str.charAt(i);
        }

        for (byte value : bytes) {
            System.out.println(value);
        }

        String s = new String(bytes);
        System.out.println("result :" + s);

    }
}
