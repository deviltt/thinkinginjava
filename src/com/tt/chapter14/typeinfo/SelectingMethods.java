package com.tt.chapter14.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//第一步：创建一个接口
interface SomeMethod{
    void boring1();
    void boring2();
    void interesting();
    void boring3();
}

//第二步：创建一个类实现这些接口
class Implementation implements SomeMethod{

    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void interesting() {
        System.out.println("interesting");
    }

    @Override
    public void boring3() {
        System.out.println("boring3");
    }
}

//第三步：创建代理类的逻辑，代理类需要实现InvocationHandler接口
class MethodSelected implements InvocationHandler{
    //第一步：以构造器的方式传入代理对象参数
    private Object proxied;

    public MethodSelected(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("interesting")){
            System.out.println("真有趣");
        }
        return method.invoke(proxied, args);
    }
}

public class SelectingMethods {
    public static void main(String[] args) {
        //传入参数的意思1. 接口的类加载器; 2.接口的Class对象数组; 3.代理类对象，传入实现接口的类对象参数
        SomeMethod someMethodProxy = (SomeMethod) Proxy.newProxyInstance(SomeMethod.class.getClassLoader(),
                new Class[]{SomeMethod.class}, new MethodSelected(new Implementation()));
        someMethodProxy.boring1();
        someMethodProxy.boring2();
        someMethodProxy.interesting();
        someMethodProxy.boring3();
    }
}
