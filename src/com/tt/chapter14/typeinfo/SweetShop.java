package com.tt.chapter14.typeinfo;
class Candy{
    static {
        System.out.println("Loading Candy");  //静态代码块，在加载类时会执行静态代码块中的内容
    }
}

class Gum{
    static {
        System.out.println("Loading Gum");  //静态代码块，在加载类时会执行静态代码块中的内容
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");  //静态代码块，在加载类时会执行静态代码块中的内容
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("after creating Candy");
        try {
            Class.forName("com.tt.chapter14.typeinfo.Gum"); //forName();方法获得Class对象的引用
        } catch (ClassNotFoundException e) {
            System.out.println("can't find Gum");
            e.printStackTrace();
        }
        System.out.println("after creating Gum");
        new Cookie();
        System.out.println("after creating cookie");
    }
}
