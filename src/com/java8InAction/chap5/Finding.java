package com.java8InAction.chap5;

import com.java8InAction.chap4.Dish;

import java.util.Optional;

import static com.java8InAction.chap4.Dish.menu;

public class Finding {
    public static void main(String[] args) {
        if (isVegetarianFriendlyMenu()) {
            System.out.println("Vegetarian friendly");
        }

        System.out.println(isHealthyMenu());
        System.out.println(isHealthyMenu2());

        Optional<Dish> dish = findVegetarianDish();
        //ifPresent接收一个Consumer，方法签名(T)->void
        dish.ifPresent(d -> System.out.println(d.getName()));
    }

    private static boolean isVegetarianFriendlyMenu() {
        return menu.stream().anyMatch(Dish::isVegetarian);  //只要流中有一个匹配就返回true
    }

    private static boolean isHealthyMenu() {
        return menu.stream().allMatch(Dish::isVegetarian);  //要求所有都匹配
    }

    private static boolean isHealthyMenu2() {
        return menu.stream().allMatch(d -> d.getCalories() < 1000); //所有热量都小于1000
    }

    private static Optional<Dish> findVegetarianDish() {
        return menu.stream().filter(Dish::isVegetarian).findAny();  //返回任意一个蔬菜
    }
}
