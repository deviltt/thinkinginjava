package com.tt.net.mindview.util;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapData17<K, V> extends LinkedHashMap<K, V> {
    //1. 直接传入一个pair键值对
    public MapData17(Generator<Pair<K, V>> generator, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Pair<K, V> p = generator.next();
            put(p.key, p.value);
        }
    }
    //2.两个分开的Generator
    public MapData17(Generator<K> generatorK, Generator<V> generatorV, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(generatorK.next(), generatorV.next());
        }
    }

    //3.A key Generator and s single value
    public MapData17(Generator<K> generatorK, V value, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(generatorK.next(), value);
        }
    }

    //4. An Iterable and a value Generator
    public MapData17(Iterable<K> generatorK, Generator<V> generatorV) {
        for (K key : generatorK) {
            put(key, generatorV.next());
        }
    }

    //5. An Iterable and a single value
    public MapData17(Iterable<K> generatorK, V value) {
        for (K key : generatorK) {
            put(key, value);
        }
    }

    public static <K, V> MapData17<K, V> map(Generator<Pair<K, V>> generator, int quantity) {
        return new MapData17<>(generator, quantity);    //返回已经已经填充好的map
    }

    public static <K, V> MapData17<K, V> map(Generator<K> generatorK, Generator<V> generatorV, int quantity) {
        return new MapData17<>(generatorK, generatorV, quantity);
    }

    public static <K, V> MapData17<K, V> map(Generator<K> generatorK, V value, int quantity) {
        return new MapData17<>(generatorK, value, quantity);
    }

    public static <K, V> MapData17<K, V> map(Iterable<K> generatorK, Generator<V> generatorV) {
        return new MapData17<>(generatorK, generatorV);
    }

    public static <K, V> MapData17<K, V> map(Iterable<K> generatorK, V value) {
        return new MapData17<>(generatorK, value);
    }
}
