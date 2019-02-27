package com.tt.chapter10.innerclasses;

public class Parcel10 {
    public Destination destination(final String dest, final float price){
        return new Destination() {  //实现了Destination接口的匿名内部类
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100){
                    System.out.println("Over budget");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination destination = parcel10.destination("Tasmania", 101.394F);
    }
}
