package com.designpattern.chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 将计算逻辑和显示逻辑分开
 */
public class Calculator2 {
    public static void main(String[] args) {
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入第一个数：");
                double a = scanner.nextDouble();
                System.out.println("请选择运算符号（+-*/)：");
                String symbol = scanner.next();
                System.out.println("请输入第二个数：");
                double b = scanner.nextDouble();
                System.out.println("结果为：" + Operation.calculate(a, b, symbol));
            }catch (InputMismatchException e){
                System.out.println("您的输入有错误：" + e.getMessage());
                System.out.println("请重新输入：");
                continue;
            }catch (ArithmeticException e){
                System.out.println("除数不能为0，请重新输入");
                continue;
            }catch (MyException e){
                System.out.println("输入的符号有问题，请检查后重新输入！");
                continue;
            }
        }
    }
}
