package com.剑指offer;

public class Question05 {
    public static String replaceSpace(String s) {
        char[] arr = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(arr[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "     ";
        ;
        System.out.println(replaceSpace(s));
    }
}
