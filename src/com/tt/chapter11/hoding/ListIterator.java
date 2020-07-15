package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Pet;
import com.tt.chapter14.typeinfo.pets.Pets;

import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        java.util.ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext())
            System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        System.out.println();
        while (it.hasPrevious())
            System.out.print(it.previous().id() + " ");
        System.out.println();
        //将游标定位到索引为3的位置
        it = pets.listIterator(3); //定位到3，下一个next();就是从3位置开始操作
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
        //将游标定位到next指向索引为3的位置
        //set()方法改变listiterator上一个经过的元素
        it=pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
