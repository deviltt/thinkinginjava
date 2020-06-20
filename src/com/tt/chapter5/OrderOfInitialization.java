package com.tt.chapter5;

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    static int c=3;
    Window window1 = new Window(1); //step2:执行构造函数之前先自动初始化

    House() {
        System.out.println("House()");      //step5
        window3 = new Window(33);   //step6:window3变量初始化了两次
    }

    Window window2 = new Window(2); //step3:不管类定义变量散步在什么位置

    void f() {
        System.out.println("f()");  //step8
    }

    Window window3 = new Window(3); //step4
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        System.out.println(House.c);
        House h = new House();  //step1:创建house对象
        h.f();  //step7
        House h1=new House();   //step8:静态类变量只会初始化一次
        h1.f();
    }
}

/**
 * 输出：
 * Window(1)
 * Window(2)
 * Window(3)
 * House()
 * Window(33)
 * f()
 * Window(1)
 * Window(2)
 * Window(3)
 * House()
 * Window(33)
 * f()
 */
