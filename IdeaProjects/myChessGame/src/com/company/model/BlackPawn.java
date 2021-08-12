package com.company.model;

public class BlackPawn extends BlackPiece {
    public int getImageToDraw(){
        return 11;
    }

    @Override
    public boolean isBlocked(int x, int y) {
        return false;
    }

    public BlackPawn(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        if(y==this.y+1 && this.x==x)
            super.move(x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if(y==this.y+1 && this.x==x)
            return true;
        return false;
    }
}
