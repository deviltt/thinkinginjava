package com.tt.chapter13;

import java.util.Random;

public class UsingStringBuilder {
    private static Random random = new Random(47);
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(random.nextInt(100));
            if (i != 9){
                stringBuilder.append(", ");
            }else {
                stringBuilder.append("]");
            }
        }
//        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
//        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
        System.out.println(usingStringBuilder.toString());
    }
}
