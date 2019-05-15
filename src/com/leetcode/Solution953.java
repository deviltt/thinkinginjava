package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 某种外星语也使用英文小写字母，
 * 但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。
 * 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，
 * 只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。
 * 输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * 输出：true
 * 输入：words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * 输出：false
 * 解释：当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，
 * 其中 '∅' 是空白字符，定义为比任何其他字符都小（更多信息）。
 * 解释：在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。
 * 思路：1.先将order字符串中字符在字符串的位置存入字典中
 * 2.将words字符串数组中的每个字符串对应到一个表示每个字符在order中位置的整型数组，并在末尾添加0
 * 3.逐一比较整型数组
 */
public class Solution953 {
    Map<Character, Integer> map;
    public boolean isAlienSorted(String[] words, String order) {
        //将字母顺序存入字典
        map = new HashMap<>();
        char[] chars = order.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }
        int[] newArr = null;
        newArr = changeArr(newArr, words[0]);
        for (int i = 1; i < words.length; i++) {
            int[] oldArr = newArr;
            newArr = changeArr(newArr, words[i]);
            for (int j = 0; j < Math.min(oldArr.length, newArr.length); j++) {
                if (oldArr[j] < newArr[j])
                    break;
                else if (oldArr[j] > newArr[j])
                    return false;
            }
        }
        return true;
    }

    /**
     * 将string中的每个字符在字典中的位置存放在newArr中
     *
     * @param newArr
     * @param string
     */
    private int[] changeArr(int[] newArr, String string) {
        newArr = new int[string.length() + 1];
        for (int i = 0; i <= string.length(); i++) {
            if (i == string.length()) {
                newArr[i] = 0;
            } else {
                newArr[i] = map.get(string.charAt(i));
            }
        }
        return newArr;
    }
}
