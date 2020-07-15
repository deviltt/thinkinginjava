package com.tt.chapter16.arrays;

import com.tt.net.mindview.util.Generator;

import java.util.Random;

public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 1;

    public CompType(int n1, int n2) {
        i = n1;
        j = n2;
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        //count的作用，每输出三个就换行
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType rv) {
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }

    private static Random r = new Random(47);

    private static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
//        CompType[] a=
    }
}
