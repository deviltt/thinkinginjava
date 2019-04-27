package com.tt.chapter13;

public class Immutable {
    private static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "abcde";
        System.out.println(q);
        String qq = upcase(q);  //实际上操作的对象的q的一份引用，字符串q本身并没有改变
        System.out.println(qq);
        System.out.println(q);
    }
}
