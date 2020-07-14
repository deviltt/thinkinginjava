package com.tt.chapter14.typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * 先在当前目录下执行 javac ShowMethods.java
 * 然后执行
 * java com.tt.chapter14.typeinfo.ShowMethods com.tt.chapter14.typeinfo.ShowMethods
 */
public class ShowMethods {
    private static String usage =
            "usage:\n" +
                    "showMethods qualified.class.name\n" +
                    "To show all methods in class or:\n" +
                    "ShowMethods qualified.class.name word\n" +
                    "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println(usage);
//            System.exit(0);
//        }
        int lines = 0;
        try {
            System.out.println(args[0]);
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getDeclaredMethods();
            Constructor[] constructors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor constructor : constructors) {
                    System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                }
                lines = methods.length + constructors.length;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}
