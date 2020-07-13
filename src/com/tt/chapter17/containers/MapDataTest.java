package com.tt.chapter17.containers;

import com.tt.net.mindview.util.Generator;
import com.tt.net.mindview.util.MapData17;
import com.tt.net.mindview.util.Pair;

import java.util.Iterator;

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number <= size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class MapDataTest {
    public static void main(String[] args) {
        System.out.println(MapData17.map(new Letters(), 11));

        System.out.println(MapData17.map(new Letters(), "Pop"));
    }
}
