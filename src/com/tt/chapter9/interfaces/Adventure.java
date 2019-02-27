package com.tt.chapter9.interfaces;

/**
 * 接口继承使用关键字extends
 */
interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){
        System.out.println("ActionCharacter fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {
    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}

public class Adventure{
    public static void t(CanFight x){
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.fight();
    }
}
