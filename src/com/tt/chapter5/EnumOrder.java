package com.tt.chapter5;

public class EnumOrder {
    public static void main(String[] args) {
        //values：用来按照enum常量的声明顺序，产生由这些常量值构成的数组
        //遍历enum常量值构成的数组，然后使得应用指向这个实例常量
        for (Spiciness s : Spiciness.values()) {
            //s.toString()：直接答应实例常量的名字
            //s.ordinal()：表示某个特定enum常量的声明顺序
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }


}