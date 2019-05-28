package com.tt.chapter15.generics.coffee;

import com.tt.net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    //创建一个class数组，以 类名.class 的方式创建class对象
    private Class[] types = {
            Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class
    };
    private static Random random = new Random();

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            //通过反射随机生成Coffee对象，class.newInstance()的方式，这个类必须要有无参的构造方法
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @return 返回iterator对象
     */
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next(); //指的是外围类的对象，如果想用内部类的对象直接用this
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator coffees = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffees.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
