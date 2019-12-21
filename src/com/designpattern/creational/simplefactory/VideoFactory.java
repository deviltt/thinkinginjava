package com.designpattern.creational.simplefactory;

/**
 * 简单工厂的两种实现方式
 * 1. 根据传入的参数，通过if判断生成哪个类的实例，并且返回
 * 2. 通过反射的机制，根据传入的Class，通过反射生成对应的Class实例，并返回
 */
public class VideoFactory {
//    public Video getVideo(String type){
//        if (type.equalsIgnoreCase("java")){
//            return new JavaVideo();
//        }else if (type.equalsIgnoreCase("python")){
//            return new PythonVideo();
//        }
//        return null;
//    }
    public Video getVideo(Class c) {
        Video video=null;
        try {
            video= (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
