package com.tt.chapter10.innerclasses;

/**
 * 匿名内部类的实例初始化模仿构创建一个构造器的效果
 * 输出结果：
 * before Base constructor initializer
 * Base constructor, i = 47
 * Inside instance initializer
 * In anonymous f()
 */
abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);   //second step
    }

    {
        System.out.println("before Base constructor initializer");  //first step
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");  //third step
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
