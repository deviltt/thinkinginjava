package com.tt.chapter13;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    /**
     * 重写了类的toString方法，返回的是该类对象的地址
     * @return
     */
    @Override
    public String toString() {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
