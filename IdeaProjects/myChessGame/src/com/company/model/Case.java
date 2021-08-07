package com.company.model;

public abstract class  Case {
    private int xPosition;
    private int yPosition;
    private boolean isEmpty;

    public Case(int xPosition, int yPosition, boolean isEmpty) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isEmpty = isEmpty;
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

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
