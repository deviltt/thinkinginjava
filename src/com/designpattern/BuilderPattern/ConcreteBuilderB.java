package com.designpattern.BuilderPattern;

//鸡米花套餐如何创建
public class ConcreteBuilderB implements Builder {
    private Product product = new Product();
    @Override
    public void buildFood() {
        System.out.println("鸡米花需要油炸哦");
        product.setFood("鸡米花");
    }

    @Override
    public void buildDrink() {
        product.setDrink("橙汁");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
