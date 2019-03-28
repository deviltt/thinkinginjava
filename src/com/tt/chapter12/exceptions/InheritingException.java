package com.tt.chapter12.exceptions;

class SimpleException extends Exception {
}

public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("throw SimpleException form f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingException inheritingException = new InheritingException();
        try {
            inheritingException.f();
        } catch (SimpleException e) {
            System.out.println("catch it!!!");
        }
    }
}
