package com.company.model;

public class BlackKing extends BlackPiece {
    public int getImageToDraw(){
        return 6;
    }

    @Override
    public boolean isBlocked(int x, int y) {
        return false;
    }

    public BlackKing(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        if(this.x+1 ==x && this.y==y || this.x ==x && this.y+1==y || this.x+1 ==x && this.y+1==y|| this.x -1 ==x && this.y-1==y
                || this.x-1 ==x && this.y==y || this.x ==x&& this.y-1==y || this.x +1 ==x && this.y-1==y || this.x-1 ==x && this.y+1==y)
            super.move(x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if((this.x+1 ==x && this.y==y || this.x ==x && this.y+1==y ||
                this.x+1 ==x && this.y+1==y|| this.x -1 ==x && this.y-1==y
                || this.x-1 ==x && this.y==y || this.x ==x&& this.y-1==y ||
                this.x +1 ==x && this.y-1==y || this.x-1 ==x && this.y+1==y   ))
            return true;
        return false;
    }
}

