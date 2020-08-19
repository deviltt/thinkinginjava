package com.剑指offer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class Offer58_I {
    public String reverseWords(String s) {
        s= s.trim();
        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ",list);
    }
}
