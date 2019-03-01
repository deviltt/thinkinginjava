package com.tt.net.mindview.util;

import com.tt.chapter14.typeinfo.pets.Pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapData {
    private static Map<Class<? extends Pet>, Integer> map = new HashMap<>();
    public static Map map(Collection<Class<? extends Pet>> collection, Integer integer){
        for (Class<? extends Pet> pet : collection)
            map.put(pet, integer);
        return map;
    }
}
