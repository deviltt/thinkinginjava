package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Hamster;
import com.tt.chapter14.typeinfo.pets.Pet;
import com.tt.chapter14.typeinfo.pets.Pets;
import com.tt.chapter14.typeinfo.pets.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        //构造一个 LinkedList，传递给构造函数一个List集合
        LinkedList<Pet> pets= new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        //返回列表的头，而不移除它
        System.out.println(pets.element());     //为空，返回java.util.NoSuchElementException异常
        System.out.println(pets.getFirst());    //为空，返回java.util.NoSuchElementException异常
        System.out.println(pets.peek());        //为空，返回 null
        //移除列表的头，并返回列表的头
        System.out.println(pets.remove());          //为空，返回java.util.NoSuchElementException异常
        System.out.println(pets.removeFirst());     //为空，返回java.util.NoSuchElementException异常
        System.out.println(pets.poll());            //为空，返回null

        pets.addFirst(new Rat());
        System.out.println(pets);
        pets.offer(Pets.randomPet());
        System.out.println(pets);
        pets.addLast(new Hamster());
        System.out.println(pets);

        pets.removeLast();              //移除最后一个元素
        System.out.println(pets);
    }
}
