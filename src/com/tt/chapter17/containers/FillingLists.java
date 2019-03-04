package com.tt.chapter17.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);

        //fill();只能替换list中已经存在的元素，并不能添加新的元素
        Collections.fill(list, new StringAddress("world!"));
        System.out.println(list);
    }
}
