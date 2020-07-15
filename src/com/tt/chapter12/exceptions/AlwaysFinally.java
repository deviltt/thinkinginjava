package com.tt.chapter12.exceptions;

class FourException extends Exception{}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block");         //1
        try {
            System.out.println("Entering second try block");    //2
            try {
                throw new FourException();
            }finally {
                System.out.println("finally in 2ed try block"); //3
            }
        }catch (FourException e){
            System.out.println("caught FourException in 1st try block"); //4
        }finally {
            System.out.println("finally in 1st try block"); //5
        }
    }
}
