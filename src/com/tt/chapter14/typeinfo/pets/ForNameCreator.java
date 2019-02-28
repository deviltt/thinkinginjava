package com.tt.chapter14.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过类加载的方式创建了一个集合，里面包含了所有Pet的Class对象
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeNames = {
            "com.tt.chapter14.typeinfo.pets.Mutt",
            "com.tt.chapter14.typeinfo.pets.Pug",
            "com.tt.chapter14.typeinfo.pets.EgyptianMau",
            "com.tt.chapter14.typeinfo.pets.Manx",
            "com.tt.chapter14.typeinfo.pets.Cymric",
            "com.tt.chapter14.typeinfo.pets.Rat",
            "com.tt.chapter14.typeinfo.pets.Mouse",
            "com.tt.chapter14.typeinfo.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        for(String name : typeNames) {
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
