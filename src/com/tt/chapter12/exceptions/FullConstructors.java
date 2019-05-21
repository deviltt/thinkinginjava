package com.tt.chapter12.exceptions;

class MyException extends Exception{
    public MyException() {
    }

    //有参构造函数，传入的参数会一同显示到错误信息当中去
    public MyException(String message) {
        super(message);
    }
}

public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);    //如果没有重定向则默认从System.err输出
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);  //重定向到控制台输出错误流信息
        }
    }
}
