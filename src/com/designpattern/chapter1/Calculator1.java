package com.designpattern.chapter1;

import java.util.Scanner;

/**
 * 实现一个计算机控制台程序
 */
public class Calculator1 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入第一个数：");
                double a = scanner.nextDouble();
                System.out.println("请选择运算符号（+-*/)：");
                String symbol = scanner.next();
                System.out.println("请输入第二个数：");
                double b = scanner.nextDouble();
                switch (symbol) {
                    //switch块里面的break是跳出switch判断
                    case "+":
                        System.out.println(a + " " + symbol + " " + b + " = " + (a + b));
                        break;
                    case "-":
                        System.out.println(a + " " + symbol + " " + b + " = " + (a - b));
                        break;
                    case "*":
                        System.out.println(a + " " + symbol + " " + b + " = " + (a * b));
                        break;
                    case "/":
                        if (b != 0) {
                            System.out.println(a + " " + symbol + " " + b + " = " + (a / b));
                        } else {
                            System.out.println("除数不能为0，请重新输入");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("输入的符号有问题，请检查后重新输入！");
                        continue;
                }
                break;  //跳出while循环
            } catch (Exception e) {
                System.out.println("您的输入有错误：" + e.getMessage());
                System.out.println("请重新输入：");
                continue;
            }
        }
    }
}
