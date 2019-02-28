package com.tt.chapter14.typeinfo.toys;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
    FancyToy(){
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class c){
        System.out.println("Class name: " + c.getName() + " is interface? [" + c.isInterface() + "]");
        System.out.println("Simple name: " + c.getSimpleName());
        System.out.println("Canonical name: " + c.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.tt.chapter14.typeinfo.toys.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(object.getClass());
    }
}
