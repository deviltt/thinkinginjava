package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Cat;
import com.tt.chapter14.typeinfo.pets.Dog;
import com.tt.chapter14.typeinfo.pets.Hamster;
import com.tt.chapter14.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My dog"));
        System.out.println(petMap.containsValue(dog));
        System.out.println(petMap.keySet());
        System.out.println(petMap.values());
    }
}
