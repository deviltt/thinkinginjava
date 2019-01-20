package com.tt.chapter14.typeinfo.pets;

public class Individual {
    private static long counter = 0;
    private final long id = counter++;  //每创建一个Individual对象，id值自动加一
    private String name;
    public Individual(String name){
        this.name = name;
    }
    public Individual() {
    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + (name == null ? "" : " " +name);
    }
    public long id(){
        return id;
    }
}
