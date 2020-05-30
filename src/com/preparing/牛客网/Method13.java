package com.preparing.牛客网;

import java.util.*;

/**
 * 字符个数计数
 */
public class Method13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s=scanner.nextLine();

        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
