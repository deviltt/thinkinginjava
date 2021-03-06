package com.tt.chapter14.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * java动态代理必须实现InvocationHandler接口
 */
class DynamicProxyHandler implements InvocationHandler{
    private Object proxied; //被代理的对象

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
//        if (args != null){
//            for (Object arg : args)
//                System.out.println(" " + arg);
//        }
        if (method.getName().equals("doSomething")){
            System.out.println("doSomething() 执行前要进行校验");
        }
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        //对这个realObject对象进行动态代理
        RealObject realObject = new RealObject();
        consumer(realObject);
        //对realObject进行代理，产生代理对象proxy
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader()
        , new Class[]{Interface.class}, new DynamicProxyHandler(realObject));
        consumer(proxy);
    }
}
