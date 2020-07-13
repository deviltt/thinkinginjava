package com.tt.chapter17.containers;

import java.util.*;

public class Unsupported {
    private static void test(String msg, List<String> list) {
        System.out.println("-----" + msg + "-----");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<>(subList);
        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll() : " + e);
        }

        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll() : " + e);
        }

        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("List.set() : " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<>(list));
        //底层数据结构是数组，不可改变数组大小，如果改变会抛出java.lang.UnsupportedOperationException异常
        test("Arrays.asList()", list);
        //Collections.unmodifiableList(list); 生成元素不可修改的Collection
        test("unmodifiableList()", Collections.unmodifiableList(list));
    }
}
