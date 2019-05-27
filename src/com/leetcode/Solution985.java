package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出一个整数数组 A 和一个查询数组 queries。
 * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
 * （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
 * 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 * 输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * 输出：[8,6,2,4]
 * 解释：
 * 开始时，数组为 [1,2,3,4]。
 * 将 1 加到 A[0] 上之后，数组为 [2,2,3,4]，偶数值之和为 2 + 2 + 4 = 8。
 * 将 -3 加到 A[1] 上之后，数组为 [2,-1,3,4]，偶数值之和为 2 + 4 = 6。
 * 将 -4 加到 A[0] 上之后，数组为 [-2,-1,3,4]，偶数值之和为 -2 + 4 = 2。
 * 将 2 加到 A[3] 上之后，数组为 [-2,-1,3,6]，偶数值之和为 -2 + 6 = 4。
 */
public class Solution985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        //遍历queries，每操作一次后遍历一次A，对偶数进行求和
        int[] result = new int[A.length];
        int temp = 0; //用来记录索引位置原先的值
        int sum = 0;
//        for (int i = 0; i < queries.length; i++) {
//            A[queries[i][1]] += queries[i][0];
//            for (int j = 0; j < A.length; j++) {
//                if (A[j] % 2 == 0) {
//                    sum += A[j];
//                }
//                result[i]=sum;
//            }
//            sum = 0;
//        }
        //先计算一开始数组中的偶数值得和
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0)
                sum += A[i];
        }
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0], index = queries[i][1];
            //首先判断索引位置是不是偶数,如果是偶数，则现将它减掉，目的是暂时不考虑这个元素，等操作过后判断是不是偶数再决定要不要加上去
            if (A[index] % 2 == 0) {
                sum -= A[index];
            }
            A[index] += val;
            if (A[index] % 2 == 0) {
                sum += A[index];
            }
            result[i] = sum;
        }
        return result;
    }
}
