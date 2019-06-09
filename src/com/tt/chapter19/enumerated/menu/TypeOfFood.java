package com.tt.chapter19.enumerated.menu;

public class TypeOfFood {
    public static void main(String[] args) {
        Food food=Food.Appetizer.SALAD;
        food=Food.MainCourse.HUMMOUS;
        System.out.println(food);
    }
}
