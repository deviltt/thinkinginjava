package com.tt.chapter17.containers;

import com.tt.net.mindview.util.CollectionData;
import com.tt.net.mindview.util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

class Government implements Generator<String> {
    String[] foundation = ("Strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "government"
    ).split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Government(), 15));
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
