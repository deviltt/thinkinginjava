package com.tt.chapter11.hoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T>{
    public ReversibleArrayList(Collection<T> collection){
        super(collection);
    }

    /**
     * 这边不能直接重写iterator();方法，这样的话只能实现一种功能，即向前遍历集合，
     * 而我们要想这个类有两种遍历集合的方式，因此只能重新新建一个方法，这个方法同样返回一个Iterable对象
     * @return
     */
    public Iterable<T> reversed(){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int current = size() - 1;   //直接调用父类中的size();方法
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s : ral){
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : ral.reversed())
            System.out.print(s + " ");
    }
}
