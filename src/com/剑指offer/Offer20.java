package com.剑指offer;

public class Offer20 {
    public boolean isNumber(String s) {
        if (s==null||s.length()==0){
            return false;
        }
        char[] chars = s.trim().toCharArray();
        boolean numExists = false, dotExists = false, eExists = false;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= '0' && c <= '9') {
                numExists = true;
            } else if (c == '.') {
                //.之前不能有.或者e
                if (dotExists || eExists) {
                    return false;
                }
                dotExists = true;
            } else if (c == 'e' || c == 'E') {
                //e/E之前不能有e/E，且前面必须要有数字
                if (eExists && !numExists) {
                    return false;
                }
                numExists = false;
                eExists = true;
            } else if (c == '+' || c == '-') {
                //第一位或者e/E的紧邻后一位，如果没有则....
                if (i != 0 && chars[i - 1] != 'e' && chars[i - 1] != 'E') {
                    return false;
                }
            } else {
                //其它字符情况
                return false;
            }
        }
        return numExists;
    }
}
