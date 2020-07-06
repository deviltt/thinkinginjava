package com.剑指offer;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 * 自定义排序规则
 * 规则如下：
 * 如果 x + y < y + x, 那么 x < y
 * 举例：
 * x = 10, y = 2
 * (x+y)=102 < 210=(y+x)
 * 所以 10 < 2
 */
public class Offer45 {
    public String minNumber(int[] nums) {
        selfQuickSort(nums, 0, nums.length - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : nums) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }


    private void selfQuickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int pivot = nums[l];
        int i = l, j = r;
        while (l < r) {
            while (selfCompare(nums[r], pivot) && l < r) {
                --r;
            }
            nums[l] = nums[r];
            while (selfCompare(pivot,nums[l]) && l < r) {
                ++l;
            }
            nums[r] = nums[l];
        }
        nums[l] = pivot;
        selfQuickSort(nums, i, l - 1);
        selfQuickSort(nums, l + 1, j);
    }

    private boolean selfCompare(int a, int b) {
        return ("" + a + b).compareTo("" + b + a) >= 0;
    }
}
