package com.tt.chapter14.typeinfo;

import java.util.ArrayList;
import java.util.List;

class CountedInteger{
    private static long counter;            //声明为static，每个对象都会共享这个变量
    private final long id = counter++;
    private int i;
//
//    public CountedInteger() {
//    }
//
//    public CountedInteger(int i){
//        this.i = i;
//    }

    @Override
    public String toString() {
        return Long.toString(id);
    }
}
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElement){
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < nElement; i++) {
            try {
                list.add(type.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public static void main(String[] args) {
        FilledList<CountedInteger> f1 = new FilledList<>(CountedInteger.class);
        System.out.println(f1.create(15));
    }
}
