package com.java8InAction.chap6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.java8InAction.chap6.Dish.menu;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class Partitioning {
    public static void main(String[] args) {
        System.out.println("Dishes partitioned by vegetarian: " + partitionByVegeterian());
        System.out.println("Vegetarian Dishes by type: " + vegetarianDishesByType());
        System.out.println("Most caloric dishes by vegetarian: " + mostCaloricPartitionedByVegetarian());
    }

    private static Map<Boolean, List<Dish>> partitionByVegeterian() {
        return menu.stream().collect(partitioningBy(Dish::isVegetarian));
    }

    private static Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType() {
        return menu.stream().collect(partitioningBy(Dish::isVegetarian,
                groupingBy(Dish::getType)
        ));
    }

    private static Map<Boolean, Dish> mostCaloricPartitionedByVegetarian() {
        return menu.stream().collect(
                partitioningBy(Dish::isVegetarian,
                        collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get))
        );
    }
}
