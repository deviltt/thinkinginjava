package com.tt.chapter14.typeinfo;

/**
 * 新的转型语法
 */
class Building{}
class House extends Building{}
public class ClassCast {
    public static void main(String[] args) {
        Building building = new House();    //向上转型
        Class<House> houseType = House.class;
        House h = houseType.cast(building);
        h = (House) building;
    }
}
