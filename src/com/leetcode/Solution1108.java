package com.leetcode;

/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * 输入：address = "1.1.1.1"
 * 输出："1[.]1[.]1[.]1"
 */
public class Solution1108 {
    public String defangIPaddr(String address) {
//        return address.replace(".", "[.]");
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars=address.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='.'){
                stringBuilder.append("[.]");
            }else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
