package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Pet;
import com.tt.chapter14.typeinfo.pets.Pets;

import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<Pet> petList = Pets.arrayList(8);
        java.util.ListIterator<Pet> iterator = petList.listIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", " + iterator.nextIndex() + ", " + iterator.previousIndex() + "; ");
        System.out.println();
        while (iterator.hasPrevious())
            System.out.print(iterator.previous().id() + " ");
        System.out.println();
        //将游标定位到索引为3的位置
        iterator = petList.listIterator(3); //定位到3，下一个next();就是从3位置开始操作
        while (iterator.hasNext()){
            iterator.next();
            iterator.set(Pets.randomPet());
        }
        System.out.println(petList);
    }
}
