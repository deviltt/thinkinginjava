package com.java8InAction.chap5;

import com.java8InAction.chap4.Dish;

import java.util.Arrays;
import java.util.List;

import static com.java8InAction.chap4.Dish.menu;
import static java.util.stream.Collectors.*;

public class Mapping {
    public static void main(String[] args) {
        //Function签名 (T)->R
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        System.out.println(dishNames);

        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println(wordLengths);

        words.stream()
                .flatMap((String line) -> Arrays.stream(line.split("")))    //把数组中的所有都汇集到一个流中
                .distinct()     //去除流中的重复项
                .forEach(System.out::println);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = Arrays.asList(6, 7, 8);
        //flatMap功能：如果不用flatMap结果是[[[1,6],[1,7],[1,8]],[[2,6],[2,7],[2,8]]]
        List<int[]> pairs = numbers1.stream()
                .flatMap((Integer i) -> numbers2.stream()
                        .map((Integer j) -> new int[]{i, j})    //把每个j映射成一个一维数组，然后通过flatMap把结果合并到一个流中
                )
                .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
                .collect(toList());
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
    }
}
