package com.tt.chapter19.enumerated.menu;

import com.tt.chapter19.enumerated.Enums;

public enum Course {
    //每一个枚举实例都会有一个values数组，里面存放着枚举的枚举即Food对应的实例
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;

    Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection(){
        return Enums.random(values);
    }
}
