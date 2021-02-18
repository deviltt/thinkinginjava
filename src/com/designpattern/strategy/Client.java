package com.designpattern.strategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 2, 3, 5, 4};
//        Sort sort = new Sort(SortStrategy.BUBBLE_SORT);
//        Sort sort = new Sort(SortStrategy.INSERT_SORT);
        Sort sort = new Sort(SortStrategy.SELECTION_SORT);
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
