package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

/**
 * @since 2020-08-16
 */
public class A08_LicenseKeyFormatting {
    public static void main(String[] args) {
        String S = "5F3Z-2e-9-w-3EWEDD";
//		String S = "2-5g-3-J";
        int k = 4;
        System.out.println(licenseKeyFormatting(S, k));
    }

    private static String licenseKeyFormatting(String s, int k) {

        // 하이픈 제거
        String replace = s.replace("-", "");

        // 소문자 대문자로 변경
        String s1 = replace.toUpperCase();
        System.out.println(s1);

        // stringbuilder 로 변환
        StringBuilder sb = new StringBuilder();
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            sb.append(s1.charAt(i));
        }

        System.out.println(sb);
        System.out.println("length : " + length);

        // 끝에서 네자리 끊기
        // string builder, insert를 사용
        for (int i = k; i < length; i = i + k) {
            int i1 = length - i;
            System.out.println(i1);
            sb.insert(i1, '-');

        }


        return sb.toString();
    }
}
