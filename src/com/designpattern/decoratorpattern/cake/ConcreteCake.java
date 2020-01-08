package com.designpattern.decoratorpattern.cake;

/**
 * 具体的对象 光的面饼
 * 啥都没有加需要6元
 */
public class ConcreteCake implements Cake {
    @Override
    public String desc() {
        return "光饼需要6元";
    }

    @Override
    public double cost() {
        return 6;
    }
}
