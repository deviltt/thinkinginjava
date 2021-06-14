package com.tt.chapter15.generics;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        // 在这里指定了h3对象只能持有 Automobile 这个类型的对象
        Holder3<Automobile> h3=new Holder3<>(new Automobile());
        Automobile a=h3.get();
//        h3.set("tt"); //set参数只允许是T类型的，这里是只允许是Automobile类，而不能是其它类型
    }
}
