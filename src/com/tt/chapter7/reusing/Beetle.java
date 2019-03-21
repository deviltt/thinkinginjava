package com.tt.chapter7.reusing;

import static com.tt.chapter7.reusing.Insect.printInit;

class Insect {
    private int i = 9;
    protected int j;

    //调用构造方法之前，对实例变量进行初始化(这题静态变量已经被初始化了，且静态变量只会被初始化一次)
    Insect() {
        System.out.println("i = " + i + ", j = " + j);  //4.打印i=9,j=0
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");  //1.打印static Insect.x1 initialized 且x1=39

    //调用这个静态方法之前，首先需要加载静态初始化变量
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);     //5.打印k=47
        System.out.println("j = " + j);     //6.打印j=39
    }

    private static int x2 = printInit("static Insect.x2 initialized");  //调用基类的printInit方法  2.打印static Insect.x2 initialized 且x2=47

    public static void main(String[] args) {            //main方法是静态的，因此首先加载静态初始化变量
        System.out.println("Beetle constructor");   //进入main方法 3.打印Beetle constructor
        Beetle beetle = new Beetle();   //首先调用基类的无参构造方法
    }
}
