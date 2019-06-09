package com.tt.chapter19.enumerated.menu;

public class Meal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //遍历Course的实例
            for(Course course:Course.values()){
                Food food=course.randomSelection();
                System.out.println(food);
            }
            System.out.println("---");
        }
    }
}
