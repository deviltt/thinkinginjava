package com.designpattern.singleton;

public class EnumSingleton {
    //构造器私有化
    private EnumSingleton() {
    }

    private enum GetEnumSingleton {
        SINGLETON;
        private EnumSingleton enumSingleton;

        GetEnumSingleton() {
            this.enumSingleton = new EnumSingleton();
        }

        private EnumSingleton getInstance() {
            return enumSingleton;
        }
    }

    public static EnumSingleton getInstance() {
        return GetEnumSingleton.SINGLETON.getInstance();
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
        System.out.println(enumSingleton1 == enumSingleton2);
    }
}
