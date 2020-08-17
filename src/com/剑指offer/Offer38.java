package com.剑指offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 剑指 Offer 38. 字符串的排列
 */
public class Offer38 {
    private char[] c;
    private List<String> list = new ArrayList<>();

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return list.toArray(new String[0]);
    }

    private void dfs(int index) {
        if (index == c.length - 1) {
            list.add(String.valueOf(c));    //把字符数组转成字符串String.valueOf(char[])
        }

        Set<Character> set = new HashSet<>();   //保存当前循环体的集合
        for (int i = index; i < c.length; i++) {
            if (set.contains(c[i])) {    //剪枝
                continue;
            }
            set.add(c[i]);
            swap(i, index);
            dfs(index + 1);
            swap(i, index);
        }
    }

    private void swap(int a, int b) {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
