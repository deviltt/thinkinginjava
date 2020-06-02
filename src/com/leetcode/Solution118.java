package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0) {
            return lists;
        }

        lists.add(new ArrayList<>());

        lists.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            //开头加一
            subList.add(1);
            //获取上一个数组
            List<Integer> tempList = lists.get(i - 1);
            //填充中间的数
            for (int j = 1; j < i; j++) {
                subList.add(tempList.get(j - 1) + tempList.get(j));
            }
            //末尾加一
            subList.add(1);

            lists.add(subList);
        }

        return lists;
    }

}
