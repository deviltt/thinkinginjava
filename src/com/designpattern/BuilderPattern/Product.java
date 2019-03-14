package com.designpattern.BuilderPattern;

/**
 * 我想创建的东西
 */
public class Product {
    //我想创建的东西都有哪些东西组成
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
