package com.io;

import java.io.*;

/**
 * 对象的序列化，反序列化
 * 1)对象序列化，就是讲Object转换成byte序列，反之叫对象的反序列化
 * 2)序列化流(ObjectOutputStream),是过滤流---writeObject
 * 反序列化流(ObjectInputStream)----readObject
 * 3)序列化接口(Serializable)
 * 这个类必须实现Serializable接口才能够实现序列化操作，否则会出现异常
 */
public class ObjectSerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化,将对象变成字节序列，写入到指定文件中去，如果文件不存在则直接创建新文件
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("demo/student.txt"));
        oos.writeObject(new Student("tt", 18));
        oos.flush();
        oos.close();

        //反序列化，从指定文件中读取字节序列并进行反序列化，变成指定的对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("demo/student.txt"));
        Student student= (Student) ois.readObject();
        System.out.println(student);
    }
}
