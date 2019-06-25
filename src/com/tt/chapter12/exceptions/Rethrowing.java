package com.tt.chapter12.exceptions;

public class Rethrowing {
    /**
     * 调用f()方法后会抛出异常Exception
     * @throws Exception
     */
    public static void f() throws Exception{
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception{
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;    //捕获f()发出的异常后重新抛出Exception异常
        }
    }

    public static void h() throws Exception{
        try {
            f();
        }catch (Exception e){
            System.out.println("Inside h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        }catch (Exception e){
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }

        try {
            h();
        }catch (Exception e){
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
