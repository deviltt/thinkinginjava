package com.designpattern.creational.factorymethod;

/**
 * 工厂模式与简单工厂模式的区别
 * 工厂模式是通过创建一个抽象的工厂，里面定义了工厂抽象的行为
 * 实现或者继承这个工厂的类需要实现这个抽象的行为，即定义了具体的工厂，
 * 这样的话如果需要添加一个新的工厂不需要修改源码，只需要重新添加一个类
 * 缺点就是如果工厂特别多的话容易导致类爆炸，因此适用于类不多的场景
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
