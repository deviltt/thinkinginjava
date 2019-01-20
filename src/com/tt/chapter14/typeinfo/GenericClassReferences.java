package com.tt.chapter14.typeinfo;

/**
 ** 泛化的Class引用
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class; //普通类引用可以被重新赋值为指向任何其他的Class对象
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        //genericIntClass = double.class;   Illegal:genericIntClass被强制只能指向Integer类型的类对象
        //Class<Number> numberClass = int.class;    //非法，因为Integer Class对象并不是Number Class对象的子类，区别于Integer是Number的子类
    }
}
