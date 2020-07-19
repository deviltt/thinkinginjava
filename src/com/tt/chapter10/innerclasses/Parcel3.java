package com.tt.chapter10.innerclasses;

public class Parcel3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Contents c = p.new Contents();  //创建内部类对象必须要先创建外部类对象(静态内部类除外)
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
