package com.leetcode;

/**
 * 输入：["cba", "daf", "ghi"]
 * 输出：1
 * 解释：
 * 当选择 D = {1}，删除后 A 的列为：["c","d","g"] 和 ["a","f","i"]，均为非降序排列。
 * 若选择 D = {}，那么 A 的列 ["b","a","h"] 就不是非降序排列了。
 * 删除某一列数据，使得每一列都是降序排列
 */
public class Solution944 {
    public int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) > A[j+1].charAt(i)) {
                    ++count;
                    break;
                }
            }
        }
        return count;
    }
}
