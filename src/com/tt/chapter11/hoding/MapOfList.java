package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.*;

import java.util.*;

public class MapOfList {
    private static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
    static {
        System.out.println("静态块初始化============》");
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May")));
    }

    public static void main(String[] args) {
//        System.out.println("People: " + petPeople.keySet());
//        System.out.println("Pets " + petPeople.values());
//        for(Person person : petPeople.keySet()){
//            System.out.println(person + " has:");
//            for(Pet pet : petPeople.get(person)){
//                System.out.println(" " + pet);
//            }
//        }
        System.out.println(petPeople);
        Iterator<Map.Entry<Person, List<? extends Pet>>> iterator = petPeople.entrySet().iterator();
//        for (Map.Entry entry : petPeople.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//            System.out.println(iterator.next().getKey());
    }
}
