package com.tt.chapter15.generics;

import com.tt.net.mindview.util.BasicGenerator;
import com.tt.net.mindview.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        //类似于工厂设计模式，不需要自己手动的new一个对象，而是通过create函数创建类对象
        Generator<CountedObject> basicGenerator= BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(basicGenerator.next());
        }
    }
}
