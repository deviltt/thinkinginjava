package com.tt.chapter14;

import java.lang.reflect.Field;

class Demo {
    private int a = 1;
    private final String s1 = "你好";
    private String s2 = "不好";

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();
        Field field = demo.getClass().getDeclaredField("s1");

        field.setAccessible(true);
        field.set(demo, "我非常不好");
        System.out.println(demo);

        field=demo.getClass().getDeclaredField("s2");
        field.setAccessible(true);
        field.set(demo, "我很不好");
        System.out.println(demo);

        field=demo.getClass().getDeclaredField("a");
        field.set(demo, 3);
        System.out.println(demo);

    }
}
