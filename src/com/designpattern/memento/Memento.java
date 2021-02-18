package com.designpattern.memento;

public class Memento {
    private int life;
    private int magic;

    public Memento(int life, int magic) {
        this.life = life;
        this.magic = magic;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
