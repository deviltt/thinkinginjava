package com.tt.chapter5;

class Cup {
    Cup(int maker) {
        System.out.println("Cup(" + maker + ")");
    }

    void f(int maker) {
        System.out.println("f(" + maker + ")");
    }
}

class Cups {
    static Cup cup1 = new Cup(10);
    static Cup cup2;
    static int a = 1;

    static {
        System.out.println(a);
        a = 3;
        System.out.println(a);
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
}
