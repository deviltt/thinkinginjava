package com.tt.chapter13;

public class Immutable {
    private static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "abcde";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}
