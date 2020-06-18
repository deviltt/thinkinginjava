package com.thread.chapter2;

public class ThreadConstruction {
    public static void main(String[] args) {
        Thread t1 = new Thread("t1");   //创建Thread对象时没有指定线程组，父线程默认为当前线程

        ThreadGroup group = new ThreadGroup("TestGroup");

        Thread t2 = new Thread(group, "t2");    //指定了线程组

        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();  //获取当前线程的线程组

        System.out.println(mainThreadGroup.getName());

        System.out.println(mainThreadGroup == t1.getThreadGroup()); //true

        System.out.println(t2.getThreadGroup() == mainThreadGroup); //false
    }
}
