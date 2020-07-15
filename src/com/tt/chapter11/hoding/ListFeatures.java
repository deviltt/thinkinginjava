package com.tt.chapter11.hoding;

import com.tt.chapter14.typeinfo.pets.*;


import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);    //添加元素 .add()
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));   //List集合中是否包含某元素 .contains()
        pets.remove(h);                 //移除某个元素 .remove()
        Pet p = pets.get(2);    //获取某个索引位置的元素 .get()
        System.out.println("4: " + p + " " + pets.indexOf(p));  //元素在List中的索引 .indexOf()
        Pet cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
        System.out.println("7: " + pets.remove(p)); //remove();方法删除失败成功都会有boolean返回值
        System.out.println("8: " + pets);
        pets.add(3, new Mouse());   //在某个位置插入 .add(index, elem)
        System.out.println("9: " + pets);   //从0开始的第三位
        List<Pet> sub = pets.subList(1, 4); //subList();方法左闭右开[1, 4)
        System.out.println("subList: " + sub);
        System.out.println("10: " + pets.containsAll(sub)); //某个list是否是 子串
//        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, random);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<>(pets); //在ArrayList的构造器中添加pets集合等于复制集合
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);    //retainAll();方法相当于两个集合的交集
        System.out.println("13: " + copy);
        copy = new ArrayList<>(pets);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new Mouse());
        System.out.println("16: " + copy);
        copy.addAll(2, sub);    //在索引为2的位置添加集合，其余元素后移
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();   //清空list .clear
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);
        Object[] objects = pets.toArray();  //toArray();方法将集合变为数组
        System.out.println("22: " + objects[3]);
        //这里传递了目标类型的数据，但是数组大小开辟为0,
        Pet[] pa = pets.toArray(new Pet[0]);    //根据参数数组的类型构造数组
        //对于参数数组太小的情况，toArray()方法将创建一个具有合适尺寸的数组
        System.out.println("23: " + pa[3].id());
    }
}
