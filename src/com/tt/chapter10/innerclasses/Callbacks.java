package com.tt.chapter10.innerclasses;

interface Incrementable {
    void incremnt();
}

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void incremnt() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    //相当于闭包，该对象连接着外部类对象的引用
    private class Closure implements Incrementable {
        @Override
        public void incremnt() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        //在这个函数外面是访问不到私有类内部的方法和作用域的，但是通过这个闭包
        //却可以在其它地方访问到私有内部类的私有作用域
        return new Closure();   //返回私有内部类的对象，相当于一个闭包
    }
}

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.incremnt();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2=new Caller(c2.getCallbackReference());   //获取闭包对象
        caller1.go();
        caller1.go();
        caller2.go();
    }
}
