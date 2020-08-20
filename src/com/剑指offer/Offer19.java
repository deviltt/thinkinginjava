package com.剑指offer;

/**
 * 剑指 Offer 19. 正则表达式匹配
 */
public class Offer19 {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.isEmpty();
        }

        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');

        //p的第二位为 * 号
        if (p.length() >= 2 && p.charAt(1) == '*') {
            //忽略*号前面的 || 回溯不能忽略*号的情况下比较是否匹配
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
