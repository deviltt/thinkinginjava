package com.test.innerClass;

import java.io.OutputStream;

class Temp {
    void test1() {
        Outer.Inner inner = new Outer().new Inner("陶涛");
        inner.sayHello();
    }
}

public class Outer {
    private static String name = "陶涛";
    private int age = 27;

    class Inner {
        private String name;

//        Inner(){}

        Inner(String name) {
            this.name = name;
        }

        public void sayHello() {
            //内部类访问外围类静态成员直接使用 Outer.value，访问外围类普通成员使用 Outer.this.value
            System.out.println("hello, " + name + "，我是" + Outer.name + "，今年" + Outer.this.age + "岁");
        }
    }

    static class StaticInner {

    }

    private void test1(String name) {
        //在外围类里面创建内部类的实例
        Inner inner = this.new Inner(name);
        inner.sayHello();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test1("温竹箐");
        Temp temp = new Temp();
        temp.test1();


    }
}
