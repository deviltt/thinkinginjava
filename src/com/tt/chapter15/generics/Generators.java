package com.tt.chapter15.generics;

import com.tt.chapter15.generics.coffee.Coffee;
import com.tt.chapter15.generics.coffee.CoffeeGenerator;
import com.tt.net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 填充一个Collection
 * 使用实现了Generator接口的类中的next方法来填充一个Collection集合
 */
public class Generators {
    /**
     * generator的原理
     * CoffeeGenerator类里面已经定义好了不同coffee的class对象，
     * 然后调用next方法，根据随机数创建随机的coffee对象
     * @param collection
     * @param generator
     * @param n
     * @param <T>
     * @return
     */
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
        Collection<Integer> fNumber = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i : fNumber)
            System.out.print(i + ", ");
    }
}
