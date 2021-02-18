package com.designpattern.memento;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        Memento memento = player.saveState();

        player.fightBoss();

        player.restoreState(memento);
    }
}
