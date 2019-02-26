package com.tt.chapter7.reusing;

/**
 * 实例初始化的四种方式：
 * 1. 在定义对象的地方
 * 2. 在类的构造器中
 * 3. 惰性初始化
 * 4. 实例初始化，总是在构造方法调用之前执行
 */
class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    //在执行Bath();构造方法之前，会先对下面的变量进行实例初始化
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        i = 47;
    }

    @Override
    public String toString() {
        if(s4 == null){
            s4 = "Joy";
        }
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
