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

/**
 * classObj.getName()和classObj.getCanonicalName()都是获取类的全限定名
 * classObj.getSimpleName()获取不含包名的类名
 */
public class ToyTest {
    static void printInfo(Class c){
        System.out.println("Class name: " + c.getName() + " is interface? [" + c.isInterface() + "]");
        System.out.println("Simple name: " + c.getSimpleName());
        System.out.println("Canonical name: " + c.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.tt.chapter14.typeinfo.toys.FancyToy");   //获取FancyToy的class对象
        }catch (ClassNotFoundException e){
            System.out.println("can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);   //打印这个class对象的类型信息
        for (Class face : c.getInterfaces())    //获取class对象所有实现的接口
            printInfo(face);    //打印每个接口的类型信息
        Class up = c.getSuperclass();   //获取父类class对象
        Object object = null;
        try {
            object = up.newInstance();  //用class创建类对象，必须使用无参构造器
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(object.getClass());   //获取对象的class对象
    }
}
