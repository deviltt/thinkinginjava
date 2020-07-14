package com.tt.chapter14.typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
    //抽象类可以有非抽象方法，如果子类没有重写这个方法，就继承这个方法
    void draw(){
        System.out.println(this + ".draw()");   //会调用当前对象的toString()方法
    }
    abstract public String toString();  //强制子类必须实现toString();方法
}

class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle";
    }
}
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());  //将数组转换为List
        for(Shape shape : shapeList)    //父类引用指向子类对象
            shape.draw();
    }
}
