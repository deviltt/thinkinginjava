package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.Pet;
import com.tt.chapter14.typeinfo.pets.Pets;


import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
    }
}
