package com.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    // 准备当天的食物
    private List<Food> prepareFoods() {
        List<Food> foods = new ArrayList<>();
        // 简单模拟，每种食物添加 10 份
        for (int i = 0; i < 10; i++) {
            foods.add(new Lobster());
            foods.add(new Watermelon());
            foods.add(new Steak());
            foods.add(new Banana());
        }
        return foods;
    }

    // 欢迎顾客来访
    public void welcome(IVisitor visitor) {
        // 获取当天的食物
        List<Food> foods = prepareFoods();
        // 将食物依次提供给顾客选择
        for (Food food : foods) {
            // 由于重写方法是动态分派的，所以这里会调用具体子类的 accept 方法，
            food.accept(visitor);
        }
    }
}
