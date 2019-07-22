package com.tt.chapter19.enumerated.myUnderstanding;

public enum Operation {
    PLUS("+") {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };

    //枚举类中的数据
    private final String symbol;

    //为了将枚举常量与数据关联起来，使用构造器
    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    //枚举类型中的抽象方法必须被它所有常量中的具体方法所覆盖
    abstract double apply(double x, double y);


    public static void main(String[] args) {
        double x = 3, y = 2;
        for (Operation operation : Operation.values()) {
            System.out.printf("%.2f %s %.2f= %.3f%n", x, operation, y, operation.apply(x, y));
        }
    }
}

