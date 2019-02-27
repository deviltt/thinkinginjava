package com.tt.chapter9.interfaces;

/**
 * 面向接口进行编程
 */

interface Game{
    boolean move();
}

interface GameFactory{
    Game getGame();
}

class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}

public class Games {
    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }

    /**
     * 不同的游戏都可以复用这段代码
     * 如果不使用工厂设计模式，则不同的游戏都要为其设计一个具体的实现，
     * 代码可复用性能不强
     * @param gameFactory
     */
    private static void playGame(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        while (game.move());
    }
}
