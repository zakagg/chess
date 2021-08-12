package com.company.model;

public interface Piece {

    public static final int SIZE  = 64;
    void move(int x, int y);
    public boolean canMove(int x,int y);
    public void eat();
    public boolean canEat();
    public abstract int getImageToDraw();
    public int getX() ;
    public void setX(int x);
    public int getY() ;
    public void setY(int y) ;
    public int getxPosition() ;
    public void setxPosition(int xPosition) ;
    public int getyPosition() ;
    public void setyPosition(int yPosition);
    public boolean isBlocked(int x,int y);
    public default int max(int x, int y)
    {
        if (x>y)
            return x;
        return y;
    }
    public default int min(int x, int y)
    {
        if (x<y)
            return x;
        return y;
    }

}
