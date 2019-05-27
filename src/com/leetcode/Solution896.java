package com.leetcode;

public class Solution896 {
    public boolean isMonotonic(int[] A) {
        return increase(A)||decrease(A);
    }

    private boolean decrease(int[] a) {
        for (int i=0,j=1;j<a.length;){
            if (a[j]<=a[i]){
                ++j;
                ++i;
            }else {
                return false;
            }
        }
        return true;
    }

    private boolean increase(int[] a) {
        for (int i=0,j=1;j<a.length;){
            if (a[j]>=a[i]){
                ++j;
                ++i;
            }else {
                return false;
            }
        }
        return true;
    }
}
