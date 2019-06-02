package com.tt.chapter19.enumerated;

import static com.tt.chapter19.enumerated.Spiciness.NOT;

public class Burrito {
    private Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree=degree;
    }

    @Override
    public String toString() {
        return "Burrito is "+degree;
    }

    public static void main(String[] args) {
//        System.out.println(new Burrito(NOT)); //如果没有静态导入则需要以这种方式引用枚举实例
        System.out.println(NOT);
    }
}
