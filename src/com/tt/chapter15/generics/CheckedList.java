package com.tt.chapter15.generics;

import com.tt.chapter14.typeinfo.pets.Cat;
import com.tt.chapter14.typeinfo.pets.Dog;
import com.tt.chapter14.typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    @SuppressWarnings("unchecked")
    private static void oldStyleMethod(List probablyDogs){
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1=new ArrayList<>();
        oldStyleMethod(dogs1);
        System.out.println(dogs1.size());   //输出1，表明Cat类型的对象添加进了只接受Dog类型对象的集合中
        //所以使用动态类型检验机制，checkedList使得每次插入都会检验dogs2集合中的元素
        List<Dog> dogs2= Collections.checkedList(new ArrayList<>(), Dog.class);
        try {
            oldStyleMethod(dogs2);
        } catch (Exception e) {
            System.out.println(e);
        }
        List<Pet> pets=Collections.checkedList(new ArrayList<>(), Pet.class);
        pets.add(new Dog());
        pets.add(new Cat());
    }
}
