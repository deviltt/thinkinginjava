package com.tt.chapter14.typeinfo;

import com.tt.chapter14.typeinfo.pets.*;

import java.util.HashMap;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    /**
     * 传参为任何继承了PetCreator的类
     * @param petCreator 面向接口编程
     */
    public static void countPets(PetCreator petCreator){
        PetCounter petCounter = new PetCounter();   //继承了HashMap，用来计数
        for(Pet pet : petCreator.createArray(20)){
            System.out.print(pet.getClass().getSimpleName() + " ");
            if(pet instanceof Pet)
                petCounter.count("pet");
            if(pet instanceof Dog)
                petCounter.count("Dog");
            if(pet instanceof Mutt)
                petCounter.count("Mutt");
            if(pet instanceof Pug)
                petCounter.count("Pug");
            if(pet instanceof Cat)
                petCounter.count("Cat");
            if(pet instanceof Manx)
                petCounter.count("EgyptianMau");
            if(pet instanceof Manx)
                petCounter.count("Manx");
            if(pet instanceof Manx)
                petCounter.count("Cymric");
            if(pet instanceof Rodent)
                petCounter.count("Rodent");
            if(pet instanceof Rat)
                petCounter.count("Rat");
            if(pet instanceof Mouse)
                petCounter.count("Mouse");
            if(pet instanceof Hamster)
                petCounter.count("Hamster");
        }
        System.out.println();
        System.out.println(petCounter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
