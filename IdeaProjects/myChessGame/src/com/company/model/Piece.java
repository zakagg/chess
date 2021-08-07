package com.company.model;

public interface Piece {
    static   final int SIZE  = 64;

    void move(int x, int y);
    public boolean canMove();
    public void eat();
    public boolean canEat();
}
