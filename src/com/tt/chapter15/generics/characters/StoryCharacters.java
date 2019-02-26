package com.tt.chapter15.generics.characters;

import com.tt.net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * 实现Iterable接口必须要实现iterator方法，该方法返回一个实现了iterator接口的对象，并对hasNext(); next();方法进行重写
 */
public class StoryCharacters implements Generator<Guys>, Iterable<Guys> {
    private Class[] types = {HeiHuzi.class, HuangYuan.class, LuFei.class, MieBa.class,
    MonkeyKingn.class, ZuoLuo.class};
    Random random = new Random(47);

    private int count;

    public StoryCharacters() {
    }

    public StoryCharacters(int count) {
        this.count = count;
    }

    @Override
    public Guys next() {
        try {
            return (Guys) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Guys> iterator() {
        return new Iterator<Guys>() {
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Guys next() {
                count--;
                return StoryCharacters.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for(Guys guy : new StoryCharacters(8)){
            System.out.println(guy);
        }
    }
}
