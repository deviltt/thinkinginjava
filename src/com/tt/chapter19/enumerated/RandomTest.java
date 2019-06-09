package com.tt.chapter19.enumerated;

enum Activity{
    SITTING, LYING, STANDING, HOPPING, RUNNING, DODGING, JUMPING, FALLING, FLYING
}

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(Enums.random(Activity.class));
        }
    }
}
