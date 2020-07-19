package com.tt.chapter10.innerclasses;

public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();  //使用的是默认的构造器创建对象
        System.out.println(c.value());
    }
}
