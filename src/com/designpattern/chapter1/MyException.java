package com.designpattern.chapter1;

public class MyException extends Exception {
    public void throwMyException() throws MyException {
        throw new MyException();
    }
}
