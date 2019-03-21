package com.designpattern.chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 使用简单工厂模式实现具有多种功能的计算器
 */
class NormalOperation {
    private double numberA;
    double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}

class AddOperation extends NormalOperation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}

class SubOperation extends NormalOperation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}

class MulOperation extends NormalOperation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}

class DivOperation extends NormalOperation {
    @Override
    public double getResult() {
        if (getNumberB()==0)
            throw new ArithmeticException();
        else
            return getNumberA() / getNumberB();
    }
}

class OperationFactory {
    public static NormalOperation getOperation(String symbol) throws MyException {
        NormalOperation operation = null;
        switch (symbol) {
            //switch块里面的break是跳出switch判断
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                throw new MyException();
        }
        return operation;
    }
}

public class Calculator3 {
    public static void main(String[] args) {
        while (true){
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入第一个数：");
                double a = scanner.nextDouble();
                System.out.println("请选择运算符号（+-*/)：");
                String symbol = scanner.next();
                System.out.println("请输入第二个数：");
                double b = scanner.nextDouble();
                NormalOperation operation=OperationFactory.getOperation(symbol);
                operation.setNumberA(a);
                operation.setNumberB(b);
                System.out.println("计算结果为："+operation.getResult());
            } catch (ArithmeticException e){
                System.out.println("除数不能为0，请重新输入");
                continue;
            } catch (MyException e){
                System.out.println("输入的符号有问题，请检查后重新输入！");
                continue;
            } catch (InputMismatchException e){
                System.out.println("请输入只包含0~9的数字");
                continue;
            }
        }
    }
}
