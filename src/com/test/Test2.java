package com.test;

/**
 * 验证了不创建对象，则实例初始化子句是不会执行的
 */
public class Test2 {
    {
        print("实例初始化");
    }
    void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
//        Test2 test2 = new Test2();
        System.out.println("hello");
    }
}
