package com.tt.chapter14.typeinfo;

import com.tt.chapter14.typeinfo.interfacea.A;
import com.tt.chapter14.typeinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());

        //C是包访问权限，因此找不到
//        if (a instanceof C){
//            C c=(C)a;
//            c.g();
//        }
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    static void callHiddenMethod(Object a, String methodName) throws Exception{
        Method g=a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
