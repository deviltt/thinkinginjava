package com.剑指offer;

/**
 * 滚动数组
 * f(i)=f(i-1)+f(i-2)   (i-2>=0 && x>=10 && x<=25)
 * p相当于 i-2，q相当于 i-1， r就是遍历到i时的结果
 */
public class Question46 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int p = 0, q = 0, r = 1;
        for (int i = 0; i < s.length(); i++) {
            p = q;
            q = r;
            r = 0;
            r += q;     //f(i)+=f(i-1)
            if (i == 0) {
                continue;
            }
            String sub = s.substring(i - 1, i + 1);
            if (sub.compareTo("10") >= 0 && sub.compareTo("25") <= 0) {
                r += p;     //条件允许的情况下 f(i)+=f(i-2)
            }
        }
        return r;
    }
}
