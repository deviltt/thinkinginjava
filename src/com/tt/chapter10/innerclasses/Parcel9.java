package com.tt.chapter10.innerclasses;

public class Parcel9 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;    //在匿名内部类中直接使用了外部类的对象，那么这个对象应该声明成final类型

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}
