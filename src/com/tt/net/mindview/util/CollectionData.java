package com.tt.net.mindview.util;

import java.util.ArrayList;

/**
 * CollectionData本质上就是一个ArrayList，只不过是调用有参构造器的时候
 * 向对象中提前存储值，这些值的来源就是generator
 *
 * @param <T>
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> generator, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(generator.next());
        }
    }

    /**
     * 调用list方法，返回一个对象，这个对象里面已经包含了quantity个T类型的对象
     *
     * @param generator
     * @param quantity
     * @param <T>
     * @return
     */
    public static <T> CollectionData<T> list(Generator<T> generator, int quantity) {
        return new CollectionData<>(generator, quantity);
    }
}
