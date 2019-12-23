package com.designpattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();
        courseFactory.createArticle().read();
        courseFactory.createVideo().play();
    }
}
