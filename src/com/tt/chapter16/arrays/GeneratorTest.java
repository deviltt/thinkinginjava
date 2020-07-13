package com.tt.chapter16.arrays;

import com.tt.net.mindview.util.CountingGenerator;
import com.tt.net.mindview.util.Generator;

public class GeneratorTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        //surroundingClass.getClasses()获取这个对象所属类及父类所有的public的内部类
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.printf(type.getSimpleName()+" : ");  //打印内部类的名称
            try {
                Generator<?> g= (Generator<?>) type.newInstance();  //通过反射创建内部类的对象
                for (int i = 0; i < size; i++) {
                    //打印10次
                    System.out.printf(g.next() + " ");
                }
                System.out.println();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
