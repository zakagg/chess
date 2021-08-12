package com.company.model;

public abstract class BlackPiece implements Piece
    {
        public int  x = 0;
        public int y=0;
        public int xPosition=0;
        public int yPosition=0;

        public int getImageToDraw(){
            return -1;
        }
        public BlackPiece(int x,int y)
        {
            this.x=x;
            this.y=y;
            this.xPosition=this.x*this.SIZE;
            this.yPosition=this.y*this.SIZE;
        }
        @Override
        public void move(int x, int y) {
            this.x=x;
            this.y=y;
            this.xPosition= this.SIZE * this.x;
            this.yPosition=this.y* this.SIZE;
        }

        @Override
        public boolean canMove(int x, int y) {
            return false;
        }


        @Override
        public void eat() {

        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getxPosition() {
            return xPosition;
        }

        public void setxPosition(int xPosition) {
            this.xPosition = xPosition;
        }

        public int getyPosition() {
            return yPosition;
        }

        public void setyPosition(int yPosition) {
            this.yPosition = yPosition;
        }

        @Override
        public boolean isBlocked(int x, int y) {
            return false;
        }

        @Override
        public boolean canEat() {
            return false;
        }
    }

