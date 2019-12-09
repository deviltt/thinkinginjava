package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Pet;
import com.tt.chapter14.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> iterator = pets.iterator();   //调用iterator()方法，将返回一个Iterator，其将准备好返回序列第一个元素
        while (iterator.hasNext()){
            Pet p = iterator.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
        for (Pet p : pets)
            System.out.println(p.id() + ":" + p + " ");
        System.out.println();
        iterator = pets.iterator(); //这一步相当于将指针移到pets集合的最前面
        for (int i = 0; i < 6; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);
    }
}
