package com.tt.chapter13.strings;

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));  //可能有一个负号，后面跟着一个或多个数字
        System.out.println("2345".matches("-?\\d+"));
        System.out.println("+933".matches("-?\\d+"));
        System.out.println("-122".matches("(-|\\+)?\\d+"));  //可能有一个负号或者正号，并且后面有多个数字
        System.out.println(String.valueOf(-234).matches("[-+]?\\d+"));
    }
}
