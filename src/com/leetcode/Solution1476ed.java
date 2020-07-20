package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1476. 子矩形查询
 * 空间换时间，记录操作本身
 * 巧妙的思路
 */
public class Solution1476ed {
    private List<Integer[]> list = new ArrayList<>();    //按照添加的顺序
    private int[][] arr;

    public Solution1476ed(int[][] rectangle) {
        arr = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        list.add(new Integer[]{row1, col1, row2, col2, newValue});  //记录更新的这个操作本身
    }

    public int getValue(int row, int col) {
        for (int i = list.size() - 1; i >= 0; i--) {
            Integer[] integers = list.get(i);
            if (integers[0] <= row && integers[2] >= row && integers[1] <= col && integers[3] >= col) {
                return integers[4];
            }
        }
        return arr[row][col];
    }
}
