package com.tt.chapter10.innerclasses;

/**
 * 使用外部类对象创建内部类对象
 * 外部类对象的引用创建内部类对象 outerObj.new InnerClassName();
 * .new 的用法
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
    }
}
