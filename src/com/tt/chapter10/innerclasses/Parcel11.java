package com.tt.chapter10.innerclasses;

/**
 * 主要为了验证创建静态内部类的对象是不需要外部类对象的
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        public static void f() {
        }

        static int x = 10;

        //静态内部类
        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();    //内部类对象
        Destination d = destination("Tasmania");    //内部类对象
    }
}
