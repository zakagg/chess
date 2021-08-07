package com.company.model;

public abstract class BlackPiece implements Piece
    {
        public int  x = 0;
        public int y=0;
        public int xPosition=0;
        public int yPosition=0;
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
        public boolean canMove() {
            return false;
        }

        @Override
        public void eat() {

        }

        @Override
        public boolean canEat() {
            return false;
        }
    }

