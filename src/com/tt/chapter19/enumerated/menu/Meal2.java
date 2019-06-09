package com.tt.chapter19.enumerated.menu;

import com.tt.chapter19.enumerated.Enums;

enum Meal2 {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    Food[] values;
    Meal2(Class<? extends Food> kind){
        values=kind.getEnumConstants();
    }

    public interface Food{
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS
        }
        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI,
            LENTILS, HUMMOUS, VINDALOO
        }
        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FORSET_CAKE,
            FRUIT, CREME_CARAMEL
        }
        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA
        }
    }
    public Food randomSelection(){
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meal2 meal2:Meal2.values()){   //遍历当前enum实例对象数组
                Food food=meal2.randomSelection();  //每一个实例都有一个values数组，随机选择一个enum对象
                System.out.println(food);   //打印出来
            }
            System.out.println("----");
        }
    }
}
