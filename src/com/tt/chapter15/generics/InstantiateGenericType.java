package com.tt.chapter15.generics;

class ClassAsFactory<T>{
    T x;
    public ClassAsFactory(Class<T> kind){
        try {
            x=kind.newInstance();   //kind为T类型的class对象，通过newInstance()方法可以创建T类型的实例
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Employee{}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> classAsFactory=new ClassAsFactory<>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        try {
            ClassAsFactory<Integer> classAsFactory1=new ClassAsFactory<>(Integer.class);    //会报错，因为Integer类没有默认的构造器
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Integer> failed");
            e.printStackTrace();
        }
    }
}
