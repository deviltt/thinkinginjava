package com.designpattern.creational.abstractfactory;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Article createArticle() {
        return new JavaArticle();
    }
}
