package com.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 10- I. 斐波那契数列递归运算的优化
 * 使用map记录之前算过的值
 */
public class Offer10_Ied {
    private static final int CONST = 1000000007;

    public int fib(int n) {
        return fib(n, new HashMap<>());
    }

    private int fib(int n, Map<Integer, Integer> map) {
        if (n < 2) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int first = fib(n - 2, map) % CONST;
        map.put(n - 2, first);
        int second = fib(n - 1, map) % CONST;
        map.put(n - 1, second);
        int res = (first + second) % CONST;
        map.put(n, res);
        return res;
    }
}
