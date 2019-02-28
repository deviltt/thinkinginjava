package com.tt.chapter11.hoding;

import java.util.*;

public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int current = words.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized(){
        return new Iterable<String>() {
            public Iterator<String> iterator(){
//                List<String> shuffled = new ArrayList<>(Arrays.asList(words));    //实际上的words数组的顺序并不会改变
                List<String> shuffled = Arrays.asList(words);   //实际上的word数组顺序已经被改变了，原因是Arrays.asList();产生的List对象会使用底层数组作为其物理实现
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed())
            System.out.print(s + " ");
        System.out.println();
        for (String s : mic.randomized())
            System.out.print(s + " ");
        System.out.println();
        for (String s : mic)
            System.out.print(s + " ");
    }
}
