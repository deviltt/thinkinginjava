package com.tt.chapter10.innerclasses;

public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();    //创建一个外部类对象
        DotThis.Inner inner = dotThis.inner();
        inner.outer().f();  //使用内部类方法返回外部类对象，调用外部类中的f();方法
    }
}
