package com.tt.chapter9.interfaces;

interface Type{
    String play();
}

interface TypeFactory{
    Type getType();
}

class Coin implements Type{
    @Override
    public String play() {
        return "不刺激";
    }
}

class CoinFactory implements TypeFactory{
    @Override
    public Type getType() {
        return new Coin();
    }
}

class Dice implements Type{
    @Override
    public String play() {
        return "刺激";
    }
}

class DiceFactory implements TypeFactory{
    @Override
    public Type getType() {
        return new Dice();
    }
}

public class Gamble {
    private static void gamble(TypeFactory typeFactory){
        Type type = typeFactory.getType();
        System.out.println(type.play());
    }

    public static void main(String[] args) {
        gamble(new CoinFactory());
        gamble(new DiceFactory());
    }
}
