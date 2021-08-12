package com.company.model;

public class BlackKnight extends BlackPiece {
    public int getImageToDraw(){
        return 9;
    }

    @Override
    public boolean isBlocked(int x, int y) {
        return false;
    }

    public BlackKnight(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        if((this.x+1==x && this.y+2==y) || (this.x+1==x && this.y-2== y)||
        (this.x+2==x && this.y+1== y) || (this.x+2==x && this.y-1== y) ||
        (this.x-1==x && this.y+2== y) ||  (this.x-1==x && this.y-2== y)||
        (this.x-2==x && this.y+1== y) ||  (this.x-2==x && this.y-1== y))
            super.move(x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if((this.x+1==x && this.y+2==y) || (this.x+1==x && this.y-2== y)||
                (this.x+2==x && this.y+1== y) || (this.x+2==x && this.y-1== y) ||
                (this.x-1==x && this.y+2== y) ||  (this.x-1==x && this.y-2== y)||
                (this.x-2==x && this.y+1== y) ||  (this.x-2==x && this.y-1== y))
            return true;
        return false;
    }
}
