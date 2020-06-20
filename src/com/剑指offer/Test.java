package com.剑指offer;

public class Test {
    void f(short x){ System.out.println("f(short)"); }
    void f(int x){ System.out.println("f(int)"); }
    void f(long x){ System.out.println("f(long)"); }
    void f(float x){ System.out.println("f(float)"); }
    void f(double x){ System.out.println("f(double)"); }

    void f1(char x){ System.out.println("f(double)");}

    void test(){
        char x='x';
        //看到传入的char类型的
        f(x);
    }

    void testDouble(){
        double x=0;
        f1((char) x);
    }
    public static void main(String[] args) {
        Test test=new Test();
        //由输出结果可知，char被提升为int类型
        //被提升后，第二个接收参数类型为int的方法被调用
        test.test();

        test.testDouble();
    }
}
