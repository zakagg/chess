package com.company.model;

public class BlackBishop extends BlackPiece {
    public int getImageToDraw(){
        return 8;
    }

    @Override
    public boolean isBlocked(int x, int y) {
        return false;
    }

    public BlackBishop(int x, int y) {
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
        if(this.x-x ==this.y-y || this.x-x ==-(this.y-y) )
            return true;
        return false;
    }
}
