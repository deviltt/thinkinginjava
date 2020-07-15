package com.leetcode;

/**
 * 给定一个字符串 S，返回 “反转后的” string，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * 示例 1：
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 */
public class Solution917 {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        //i从左到右，j从右到左进行字符的交换
        for (int i = 0, j = arr.length - 1; i < j; ) {
            while (!((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) && i < j)
                i++;
            while (!((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'Z')) && i < j)
                j--;
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}
