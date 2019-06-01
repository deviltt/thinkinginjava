package com.tt.chapter19.enumerated;

enum Shrubbery {
    GROUND, CRAWLING, HANGING
}

/**
 * values();方法返回enum实例的数组
 * ordinal();方法返回实例在申明时的次序
 * Enum类实现了Comparable接口，所以具有compareTo方法
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery shrubbery : Shrubbery.values()) {
            System.out.println(shrubbery + " ordinal: " + shrubbery.ordinal());
            System.out.print(shrubbery.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.print(shrubbery.equals(Shrubbery.CRAWLING) + " ");
            System.out.println(shrubbery == Shrubbery.CRAWLING);
            System.out.println(shrubbery.getDeclaringClass());
            System.out.println(shrubbery.name());
            System.out.println("------------------------");
        }
        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s); //Enum中定义的static方法，根据给定的类型和名字返回相应的实例
            System.out.println(shrubbery);
        }
    }
}
