package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Pet;
import com.tt.chapter14.typeinfo.pets.Pets;

import java.util.*;

public class CrossContainerIteration {
    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> pets1 = new LinkedList<>(pets);
        HashSet<Pet> pets2 = new HashSet<>(pets);
//        TreeSet<Pet> pets3 = new TreeSet<>(pets);
        display(pets.iterator());
        display(pets1.iterator());
        display(pets2.iterator());
    }

    /**
     * 如果不用iterator那么需要定义三个display方法，参数类型分别
     * 为ArrayList<Pet>、LinkedList<Pet>、HashSet<Pet>
     * @param iterator iterator统一了容器的类型
     */
    private static void display(Iterator<Pet> iterator) {
        while (iterator.hasNext()){
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
}
