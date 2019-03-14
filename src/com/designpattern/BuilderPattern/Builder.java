package com.designpattern.BuilderPattern;

/**
 * Builder接口定义了行为
 */
public interface Builder {
    void buildFood();
    void buildDrink();
    Product getProduct();
}
