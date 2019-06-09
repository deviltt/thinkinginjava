package com.tt.chapter19.enumerated;

import java.util.EnumSet;

import static com.tt.chapter19.enumerated.AlarmPoints.*;

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);    //noneOf(class elementType);创建指定类型的空enumSet集合
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN)); //添加多个指定类型的enum实例
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);  //添加指定类型的全部实例
        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));  //range范围内的全部实例
        System.out.println(points);
        points=EnumSet.complementOf(points);    //相当于差集，返回当前传入的集合中没有的实例
        System.out.println(points);
    }
}
