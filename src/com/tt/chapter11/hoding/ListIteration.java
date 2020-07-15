package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Pet;
import com.tt.chapter14.typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        //遍历listIterator,并且显示前一个和后一个索引
        while (it.hasNext()) {
            System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        }
        System.out.println();
        //从后往前追溯，打印Id
        while (it.hasPrevious()) {
            System.out.print(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
    }
}
