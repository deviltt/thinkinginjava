package com.tt.chapter19.enumerated;

import java.util.Random;

public class Enums {
    private static Random random=new Random(47);
    //泛型：给传入的参数设定了一个下限，即只能是Enum类或者是继承自Enum类
    public static <T extends Enum<T>> T random(Class<T> enumClass){
        return random(enumClass.getEnumConstants());
    }

    public static <T> T random(T[] enumConstants) {
        return enumConstants[random.nextInt(enumConstants.length)];
    }
}
