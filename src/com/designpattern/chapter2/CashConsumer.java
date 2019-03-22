package com.designpattern.chapter2;

import java.util.Scanner;

public class CashConsumer {
    public static void main(String[] args) {
        while (true) {
            try {
                //客户端依赖两个类，一个是CashSuper，另一个是CashFactory
                CashSuper cashSuper;
                Scanner scanner = new Scanner(System.in);
                System.out.print("请输入单价：");
                double unitPrice = scanner.nextDouble();
                System.out.print("请输入数量：");
                int number = scanner.nextInt();
                System.out.print("请输入折扣类型:");
                String type = scanner.next();
                cashSuper = CashFactory.cashSuperFactory(type);
                System.out.print("收入金额为：" + cashSuper.acceptCash(unitPrice * number));
                break;
            } catch (NullPointerException e) {
                System.out.println("没有此活动。。。");
                continue;
            }
        }
    }
}
