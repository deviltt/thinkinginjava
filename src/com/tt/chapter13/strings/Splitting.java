package com.tt.chapter13.strings;

import java.util.Arrays;

public class Splitting {
    private static String knights="Then, when you have found the shrubbery, you must "+
            "cut down the mightiest tree in the forest... "+
            "with... a herring!";

    private static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex,2)));
        System.out.println(knights.split(regex, 3).length); //分割n次，分割后的字符串数组的长度即为n
    }

    public static void main(String[] args) {
        split(" "); //按照空格分割字符串
//        split("\\W+");  //将非单词字符进行分割
//        split("n\\W+");
    }
}
