package com.java8InAction.chap5;

import com.java8InAction.chap4.Dish;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.java8InAction.chap4.Dish.menu;

public class NumericStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);

        Arrays.stream(numbers.toArray()).forEach(System.out::println);

        int calories =
                menu.stream()
                        .mapToInt(Dish::getCalories)
                        .sum();
        System.out.println(calories);

        OptionalInt maxCalories =
                menu.stream()
                        .mapToInt(Dish::getCalories)
                        .max();

//        if (maxCalories.isPresent()) {
//            max = maxCalories.getAsInt();
//        } else {
//            max = 1;
//        }
        int max = maxCalories.orElse(1);    //等价于这句
        System.out.println(max);

        //数值范围
        //产生1-100内的所有偶数
        IntStream evenNumbers =
                IntStream
                        .rangeClosed(1, 100)
                        .filter(value -> value % 2 == 0);
        System.out.println(evenNumbers.count());

        //创建一个勾股数流
        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                        );

        Stream<double[]> pythagoreanTriples2 =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .mapToObj(b ->
                                                new double[]{a, b, Math.sqrt(a * a + b * b)})
                                        .filter(t -> t[2] % 1 == 0)
                        );
        pythagoreanTriples.forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }
}
