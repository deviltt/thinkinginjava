package com.tt.chapter14.typeinfo.toys;

/**
 * class.newInstance();返回的不是精确类型,而只是Object
 * 原因是getSuperclass();返回的是不精确类型? super FancyToy，而不是具体的Toy
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> fancyToyClass = FancyToy.class;
        FancyToy fancyToy = fancyToyClass.newInstance();
        Class<? super FancyToy> up = fancyToyClass.getSuperclass();
        Object object = up.newInstance();
    }
}
