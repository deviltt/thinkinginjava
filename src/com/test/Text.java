package com.test;

/**
 * 程序执行顺序：
 *     类内部任何方法执行官之前，定义的静态类变量都会得到初始化
 * 1.  要首次进入main函数，main是静态函数，因此首先初始化静态变量
 * 2.  k = 0; 且只访问一次
 * 3.  要执行Text("t1");构造方法时，执行实例初始化子句(只有创建对象调用构造方法是才会初始化实例初始子句)
 * 4.  要执行Text("t2");构造方法时，执行实例初始化子句
 * 5.  执行print("i");
 * 6.  初始化n = 99;
 * 7.  静态作用域初始化print("静态块");
 * 9.  执行main
 * 10. 调用Text("init");构造方法时，执行实例初始化子句
 */
public class Text {
    public static int k = 0;
    public static Text t1 = new Text("t1"); //每次要调用构造方法时都会先执行实例化初始子句
    public static Text t2 = new Text("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");

    {
        print("构造块");
    }
    static {
        print("静态块");
    }

    public Text(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++i;
        ++n;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++n;
        return ++i;
    }

    public static void main(String args[]) {
        Text t = new Text("init");
    }
}