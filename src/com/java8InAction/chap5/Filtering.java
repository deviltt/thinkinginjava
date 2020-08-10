package com.java8InAction.chap5;

import com.java8InAction.chap4.Dish;

import java.util.Arrays;
import java.util.List;

import static com.java8InAction.chap4.Dish.menu;
import static java.util.stream.Collectors.*;

/**
 * 过滤器
 * filter、limit、skip、distinct
 */
public class Filtering {
    public static void main(String[] args) {
        //过滤出素食菜单
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

        //打印素食，方法引用
        vegetarianMenu.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)  //过滤偶数
                .distinct() //不同的偶数
                .forEach(System.out::println);

        List<Dish> dishesLimit3 = menu.stream()
                .filter(d -> d.getCalories() > 300) //过滤出卡路里大于300的
                .limit(3)   //取前三个
                .collect(toList());

        dishesLimit3.forEach(System.out::println);

        List<Dish> dishesSkip2 = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)    //跨过前两个，从第三个开始
                .collect(toList());
    }
}
