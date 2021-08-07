package com.company.vue;

import java.awt.*;

public class DrawWhiteCase implements DrawComposant {
    int x;
    int y;

    public DrawWhiteCase(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void draw(Graphics g)
    {
        g.setColor(new Color(235,235, 208));
        g.fillRect(x*64, y*64, 64, 64);
    }
}
