package com.swordoffer;

/**
 * 二维数组中的查找
 */
public class Solution4 {
    public boolean find(int[][] arr, int target) {
        if (arr.length == 0 || arr[0].length == 0)
            return false;
        int row = 0;
        int col = arr[0].length - 1;
        int temp = arr[row][col]; //temp表示右上角的元素
        while (target != temp) {
            //控制边界
            if (col>0&&row<arr.length-1){
                //如果值小于右上角元素，则列减一
                if (target>temp)
                    col--;
                else if (target<temp)   ////如果值大于右上角元素，则列加一
                    row++;
                temp=arr[row][col];
            }
            else
                return false;
        }
        return true;
    }
}
