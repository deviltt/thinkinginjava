package com.leetcode;

import java.util.Collections;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 例如，给定三角形：
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 */
public class Solution120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i>=1){
                    if (j==0){
                        //最左边的元素
                        triangle.get(i).set(j, triangle.get(i-1).get(0)+triangle.get(i).get(0));
                    }
                    else if (j==i){
                        //最右边的元素
                        triangle.get(i).set(j, triangle.get(i-1).get(j-1)+triangle.get(i).get(j));
                    }
                    else{
                        //中间的元素
                        triangle.get(i).set(j, triangle.get(i).get(j)+ Math.min(triangle.get(i-1).get(j-1), triangle.get(i-1).get(j)));
                    }
                }
            }
        }
        return Collections.min(triangle.get(triangle.size() - 1));
    }

//    public static void main(String[] args) {
//        List<List<Integer>> lists=new ArrayList<>();
//        lists.add()
//    }
}
