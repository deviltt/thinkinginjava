package com.tt.chapter16.arrays;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
    private static Random random = new Random(47);
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too big");
        }
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length]; //已经生成的口味就不要重复生成了
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(FLAVORS.length); //t的范围为 [0, 8)
            } while (picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return results;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));  //打印数组使用Arrays.toString()
        }
    }
}
