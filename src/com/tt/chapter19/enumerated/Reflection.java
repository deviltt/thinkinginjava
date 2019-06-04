package com.tt.chapter19.enumerated;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore {HERE, THERE}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("-----Analyzing " + enumClass + " ------");  //toString方法中的格式 class getName()
        System.out.println("Interfaces:");
        for (Type t : enumClass.getGenericInterfaces()) {
            System.out.println(t);
        }
        System.out.println("Base: " + enumClass.getSuperclass());   //父类java.lang.Enum
        System.out.println("Methods");
        Set<String> methods = new TreeSet<>();
        for (Method method : enumClass.getMethods()) {
            methods.add(method.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        System.out.println("Explore.removeAll(Enum): "+exploreMethods.removeAll(enumMethods));
        System.out.println(exploreMethods);
//        OSExecute.command("javap Explore")
    }
}
