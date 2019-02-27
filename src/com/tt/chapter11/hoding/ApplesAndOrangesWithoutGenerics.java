package com.tt.chapter11.hoding;

import java.util.ArrayList;

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
        apples.add(new Orange());
        try{
            for (int i = 0; i < apples.size(); i++) {
                ((Apple)apples.get(i)).id();    //如果id方法声明为static的，则只能通过类名访问，而不能直接用类对象进行访问
            }
        }catch (ClassCastException e){
            System.out.println("类型转换错误");
            e.printStackTrace();
        }

    }
}
