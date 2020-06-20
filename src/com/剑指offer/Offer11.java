package com.剑指offer;

public class Offer11 {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                //因为numbers[mid] < numbers[right]，因此number[mid]可能为最小值
                //因此才会使得right=mid
                right = mid;
            } else {
                --right;
            }
        }
        return numbers[right];
    }
}
