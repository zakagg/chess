package com.company.model;

import com.company.model.factory.AllPiecesFactory;

public class BlackRooks extends BlackPiece{
    public int getImageToDraw(){
        return 10;
    }

    @Override
    public boolean isBlocked(int x, int y)
    {
        Piece piece;
        if (y==this.y )
            for (int i=min(x,this.x)+1;i<max(x,this.x);i++) {
                System.out.println("x " + i + " y " + this.y);
                piece= AllPiecesFactory.getPiece(i,y);
                if(piece!=null){
                    return true;
                }
            }
        if(x==this.x)
            for (int i=min(y,this.y)+1;i<max(y,this.y);i++) {
                System.out.println("x " + i + " y " + this.x);
                piece= AllPiecesFactory.getPiece( this.x,i);
                if(piece!=null){
                    return true;
                }
            }
        return false;
    }

    public BlackRooks(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        if ((this.x ==x) || (this.y ==y))
            super.move(x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if ((this.x ==x) || (this.y ==y))
            return true;
        return false;
    }



}
