package com.company.model;

public class WhiteBishop extends WhitePiece {
    public int getImageToDraw(){
        return 2;
    }

    @Override
    public boolean isBlocked(int x, int y) {
        return false;
    }

    public WhiteBishop(int x, int y) {
        super(x, y);
    }
    @Override
    public void move(int x, int y) {
        if(this.x-x ==this.y-y || this.x-x ==-(this.y-y) )
        {
            super.move(x, y);
        }

    }

    @Override
    public boolean canMove(int x, int y) {
        return false;
    }
}
