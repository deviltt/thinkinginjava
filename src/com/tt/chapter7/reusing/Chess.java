package com.tt.chapter7.reusing;

/**
 * 如果是有参的构造器，则必须在导出类中的构造器中使用
 * super调用基类的构造器，编译器也会提示
 */
class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame{
    Chess(int i) {
        super(i);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        new Chess(11);
    }
}
