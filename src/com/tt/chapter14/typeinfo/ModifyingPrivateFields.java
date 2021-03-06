package com.tt.chapter14.typeinfo;

import com.tt.chapter8.polymorphism.music.Wind;

import java.lang.reflect.Field;

class WithPrivateFinalField {
    private int i = 1;
    private final String s = "I'm totally safe";
    private String s2 = "Am I safe?";

    @Override
    public String toString() {
        return "i = " + i + ", " + s + ", " + s2;
    }
}

public class ModifyingPrivateFields {
    public static void main(String[] args) throws Exception {
        WithPrivateFinalField pf = new WithPrivateFinalField();
        System.out.println(pf);

        Field f = pf.getClass().getDeclaredField("i");  //获取声明的名称为 i 的域
        f.setAccessible(true);
        System.out.println("f.getInt(pf): " + f.getInt(pf));
        f.setInt(pf, 47);
        System.out.println(pf);

        f = pf.getClass().getDeclaredField("s");  //获取声明的名称为 s 的域
        f.setAccessible(true);
        System.out.println("f.get(pf): " + f.get(pf));
        f.set(pf, "No, you're not!");
        System.out.println(pf);

        f=pf.getClass().getDeclaredField("s2");  //获取声明的名称为 s2 的域
        f.setAccessible(true);
        System.out.println("f.get(pf): " + f.get(pf));
        f.set(pf, "No, you're not!");
        System.out.println(pf);
    }
}
