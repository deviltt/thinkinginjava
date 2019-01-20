package com.tt.chapter14.typeinfo;

interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{
    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
}

//代理类，实现了interface接口，可以对实现了interface接口的类进行代理，并且对被代理对象的方法进行增强
class SimpleProxy implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }
    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }
    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse" + arg);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo{
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("banana");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
