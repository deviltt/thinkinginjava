package com.tt.chapter7.reusing;

/**
 * 创建导出类对象时，会自动的逐层向上调用基类的构造器
 * 即使你没定义构造器，默认的构造器同样会逐层向上调用基类的构造器
 */
class Art{
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    public Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        new Cartoon();
    }
}
