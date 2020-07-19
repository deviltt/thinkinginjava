package com.tt.chapter10.innerclasses;

/**
 * 局部内部类：类似于js闭包的概念
 */
public class Parcel5 {
    /**
     * 返回了一个对局部内部类对象的一个引用
     * @param s 传递参数
     * @return 将局部内部类向上转型
     */
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;

            private PDestination(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return label+" tt";
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destination = parcel5.destination("Tasmania");  //相当于闭包的概念，虽然
        System.out.println(destination.readLabel());
    }
}
