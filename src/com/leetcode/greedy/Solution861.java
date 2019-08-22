package com.leetcode.greedy;

/**
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 * 返回尽可能高的分数。
 * 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * 输出：39
 * 解释：
 * 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * <p>
 * 思路：对于每一行，只要第一个数是1，则这一行或者列的值至少是2^(n-1)，
 * 对于除了第一列的其他列，只要保证每一列的1的个数比0的个数要多，如果少
 * 就需要将这一列进行翻转
 */
public class Solution861 {
    public int matrixScore(int[][] A) {
        //先将每一行开头都置为1
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] != 1) {
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j] ^= 1;
                }
            }
        }
        //后面保证出第一列外的每一列1的数目都比0要多即可
        for (int i = 1; i < A[0].length; i++) {
            int count_0 = 0, count_1 = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j][i] == 0) {
                    ++count_0;
                } else {
                    ++count_1;
                }
            }
            if (count_0 > count_1) {
                for (int k = 0; k < A.length; k++) {
                    A[k][i] ^= 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            int temp = 0;
            for (int j = 0; j < A[0].length; j++) {
                temp += A[i][j] << (A[0].length - 1 - j);
            }
            ans += temp;
        }
        return ans;
    }
}
