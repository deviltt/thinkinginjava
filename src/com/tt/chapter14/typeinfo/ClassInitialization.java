package com.tt.chapter14.typeinfo;

import java.util.Random;

class Initable{
    static final int staticFianl = 47;  //常数静态域，调用时不会执行初始化操作
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;    //并不是常数静态域，因此使用这个变量时会执行初始化，运行静态代码块的内容
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;    //使用.class语法来获得对类的引用不会引发初始化
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFianl);   //staticFinal属性属于编译期常量，不需要进行初始化进行初始化就可以读取

        System.out.println(Initable.staticFinal2);

        System.out.println(Initable2.staticNonFinal);

        try {
            Class initable3 = Class.forName("com.tt.chapter14.typeinfo.Initable3"); //使用Class.forName();会引发初始化操作
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
