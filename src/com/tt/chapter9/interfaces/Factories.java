package com.tt.chapter9.interfaces;

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class implemention1 implements Service{
    public implemention1() {
    }

    @Override
    public void method1() {
        System.out.println("Implemention1 mentod1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention1 mentod2");
    }
}

class implemention1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new implemention1();
    }
}

class implemention2 implements Service{
    public implemention2() {
    }

    @Override
    public void method1() {
        System.out.println("Implemention2 mentod1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention2 mentod2");
    }
}

class implemention2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new implemention2();
    }
}

public class Factories {
    public static void main(String[] args) {
        serviceConsumer(new implemention1Factory());
        serviceConsumer(new implemention2Factory());
    }

    private static void serviceConsumer(ServiceFactory serviceFactory) {
        Service service = serviceFactory.getService();
        service.method1();
        service.method2();
    }
}
