package com.tt.chapter19.enumerated;

import com.tt.net.mindview.util.Generator;

import java.util.Random;

/**
 * enum继承自ENUM，所以只能实现接口
 */
enum CartoonCharacter implements Generator<CartoonCharacter>{
    SLAPPY, SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;

    private Random random=new Random(47);

    @Override
    public CartoonCharacter next() {
        return values()[random.nextInt(values().length)];
    }
}

public class EnumImplementation {
    private static <T> void printNext(Generator<T> generator){
        System.out.println(generator.next()+", ");
    }

    public static void main(String[] args) {
        //获取一个enum实例
        CartoonCharacter cartoonCharacter=CartoonCharacter.BOUNCY;
        for (int i = 0; i < 11; i++) {
            printNext(cartoonCharacter);
        }
    }
}
