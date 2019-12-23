package com.tt.chapter12.exceptions;

/**
 * 创建了自定义的异常，必须继承已有的异常类
 */
class SimpleException extends Exception {
    SimpleException(String msg) {
        super(msg);
    }
}

public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("throw SimpleException form f()");
        throw new SimpleException("Mabi");
    }

    public static void main(String[] args) {
        InheritingException inheritingException = new InheritingException();
        /**
         * 在调用f()函数时，会抛出自定义的异常
         */
        try {
            inheritingException.f();
        } catch (SimpleException e) {
            System.out.println(e.getMessage() + " catch it!!!");
        }
    }
}
