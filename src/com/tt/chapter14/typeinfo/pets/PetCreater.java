package com.tt.chapter14.typeinfo.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreater {
    private Random random = new Random(47);
    public abstract List<Class<? extends Pet>> getTypes();
    public Pet randomPet(){
        int n = random.nextInt(getTypes().size());
        Pet pet = null;
        try {
            pet = getTypes().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return pet;
    }
    public Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }
    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
