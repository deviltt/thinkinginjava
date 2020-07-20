package com.tt.chapter10.innerclasses;

//nest0
class MNA {
    private void f() {
    }

    //nest1
    class A {
        private void g() {
        }

        //nest2
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        //创建外部类对象
        MNA mna = new MNA();
        //创建nest1
        MNA.A mnaa = mna.new A();
        //创建nest2
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
