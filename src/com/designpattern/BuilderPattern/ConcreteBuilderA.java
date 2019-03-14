package com.designpattern.BuilderPattern;

//汉堡套餐如何创建
public class ConcreteBuilderA implements Builder {
    private Product product = new Product();
    @Override
    public void buildFood() {
        System.out.println("汉堡不需要油炸哦");
        product.setFood("汉堡");
    }

    @Override
    public void buildDrink() {
        product.setDrink("可乐");
    }

    @Override
    public Product getProduct(){
        return product;
    }
}
