package com.tt.chapter8.polymorphism.music;

public class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
