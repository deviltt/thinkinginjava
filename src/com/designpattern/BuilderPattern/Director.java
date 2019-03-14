package com.designpattern.BuilderPattern;

public class Director {
    private Builder builder;
    //针对接口编程
    public Director(Builder builder){
        this.builder = builder;
    }

    //制定生产过程：先创建主食，然后在倒饮料
    public Product create(){
        builder.buildFood();
        builder.buildDrink();
        System.out.println("先生您好，您定的套餐为:");
        return builder.getProduct();
    }
}
