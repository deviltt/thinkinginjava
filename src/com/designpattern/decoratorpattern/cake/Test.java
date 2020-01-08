package com.designpattern.decoratorpattern.cake;

public class Test {
    public static void main(String[] args) {
        ConcreteCake concreteCake=new ConcreteCake();   //裸饼
        EggDecorator eggDecorator=new EggDecorator(concreteCake);   //加鸡蛋
        HamDecorator hamDecorator=new HamDecorator(eggDecorator);   //加火腿

        System.out.println(hamDecorator.desc());
        System.out.println(hamDecorator.cost());
    }
}
