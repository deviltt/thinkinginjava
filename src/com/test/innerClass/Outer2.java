package com.test.innerClass;

public class Outer2 {
    public void test1() {
        //在外围类的外面创建外围类的内部类实例
        Outer.Inner inner = new Outer().new Inner("温竹箐");
        inner.sayHello();
    }

    public static void main(String[] args) {
        Outer2 outer2=new Outer2();
        outer2.test1();
    }
}
