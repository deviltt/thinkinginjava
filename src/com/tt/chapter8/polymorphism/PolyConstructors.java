package com.tt.chapter8.polymorphism;

class Glyph {
     void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    Glyph(int r) {
        System.out.println("GlyphR() before draw()");
        draw();
        System.out.println("GlyphR() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    //调用这个有参构造器之前，需要调用基类的 默认构造器
    //如果想调用有参构造器，必须显示的使用Super调用
    //如果显示的调用了super申明的基类构造器，便不会再执行 默认 构造器
    RoundGlyph(int r) {
        super(3);
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
