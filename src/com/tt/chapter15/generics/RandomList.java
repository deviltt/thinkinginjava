package com.tt.chapter15.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * 泛型的功能：调用类的select方法时，返回列表中的任意一个值
 * @param <T>
 */
public class RandomList<T> {
    private ArrayList<T> storage=new ArrayList<>();
    private Random random=new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList=new RandomList<>();
        for(String s:"I like watching TV and comic".split(" ")){
            randomList.add(s);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(randomList.select());
        }
    }
}
