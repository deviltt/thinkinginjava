package com.designpattern.chapter1;

public class Operation {
    //定义运算结果
    private static double result;
    public static double calculate(double numberA, double numberB, String symbol) throws MyException {
            switch (symbol) {
                //switch块里面的break是跳出switch判断
                case "+":
                    System.out.println(numberA + " " + symbol + " " + numberB + " = " + (numberA + numberB));
                    break;
                case "-":
                    System.out.println(numberA + " " + symbol + " " + numberB + " = " + (numberA - numberB));
                    break;
                case "*":
                    System.out.println(numberA + " " + symbol + " " + numberB + " = " + (numberA * numberB));
                    break;
                case "/":
                    if (numberB != 0) {
                        System.out.println(numberA + " " + symbol + " " + numberB + " = " + (numberA / numberB));
                    } else {
                        throw new ArithmeticException();    //除数为0是ArithmeticException();
                    }
                    break;
                default:
                    throw new MyException();    //符号输入错误jdk没有指定的错误，抛出自定义的错误类型
            }
        return result;
    }
}
