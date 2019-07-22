package com.tt.chapter19.enumerated.demo;

import java.util.EnumSet;

public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }

    public static void main(String[] args) {
        for (Ensemble ensemble:values()){
            System.out.println(ensemble.numberOfMusicians());
        }
    }
}
