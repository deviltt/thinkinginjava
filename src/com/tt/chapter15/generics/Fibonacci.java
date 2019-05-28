package com.tt.chapter15.generics;

import com.tt.net.mindview.util.Generator;

/**
 * 类功能：通过next方法生成Fibonacci数列
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    /**
     * 也可以用递归，但是效率比较低
     * @param i
     * @return
     */
    private Integer fib(int i) {
        int a = 1, b = 1;
        if (i == 0 || i == 1)
            return b;
        for (int j = 2; j <= i; j++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Fibonacci gen=new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(gen.next()+" ");
        }
    }
}
