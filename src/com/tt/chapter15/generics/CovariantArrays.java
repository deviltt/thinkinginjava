package com.tt.chapter15.generics;

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Fruit{}
class Orange extends Fruit{}

/**
 * 实际类型是Apple类型，基类的引用指向导出类，这不会
 * 在编译器报错，但是运行时会报错
 */
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit=new Apple[10];
        fruit[0]=new Apple();
//        fruit[1]=new Jonathan();  //运行时的错误

        fruit[0]=new Fruit();
    }
}
