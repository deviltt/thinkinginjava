package com.leetcodespecialtopic.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 658. 找到 K 个最接近的元素
 */
public class Solution658 {
    /**
     * @param arr 源数组
     * @param k   需要找到得个数
     * @param x   目标数
     * @return 结果集
     */
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        //1. 先找到目标数得位置
        int left = 0, right = arr.length, mid = 0;
        int tempLeft = 0, tempRight = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                result.add(arr[mid]);
                --k;
                tempLeft = mid - 1;
                tempRight = mid + 1;
                break;
            } else if (arr[mid] > x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left == 0) {
            for (int i = 0; i < k; i++) {
                result.add(arr[i]);
            }
            return result;
        } else if (right == arr.length) {
            for (int i = arr.length - 1; i > k; i--) {
                result.add(arr[i]);
            }
            return result;
        } else {
            tempRight = mid;
            tempLeft = mid - 1;
        }
        while (k > 0) {
            if (tempLeft < 0) {
                result.add(arr[tempRight]);
                --k;
            } else if (tempRight > arr.length - 1) {
                result.add(arr[tempLeft]);
                --k;
            } else {
                int abs = Math.abs(arr[mid] - arr[tempLeft]) - Math.abs(arr[mid] - arr[tempRight]);
                if (abs < 0) {
                    result.add(arr[tempLeft--]);
                    --k;
                } else if (abs > 0) {
                    result.add(arr[tempRight++]);
                    --k;
                } else {
                    if (k >= 2) {
                        result.add(arr[tempLeft--]);
                        result.add(arr[tempRight++]);
                        k -= 2;
                    } else {
                        result.add(arr[tempLeft--]);
                        --k;
                    }
                }
            }
            //绝对值小得添加到result中
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
    }
}
