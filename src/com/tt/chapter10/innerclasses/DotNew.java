package com.tt.chapter10.innerclasses;

/**
 * 使用外部类对象创建内部类对象
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
    }
}
