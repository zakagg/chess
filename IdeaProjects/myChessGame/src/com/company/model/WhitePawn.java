package com.company.model;

public class WhitePawn extends WhitePiece {
    public int getImageToDraw(){
        return 5;
    }

    @Override
    public boolean isBlocked(int x, int y) {
        return false;
    }

    public WhitePawn(int x, int y) {
        super(x, y);
    }
    public void move(int x, int y) {
        if(y==this.y-1 && this.x==x)
            super.move(x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        return false;
    }

}
