package com.company.vue;

import java.awt.*;
import java.util.LinkedList;
/**
    This Class will implement Draw all the board.
 **/

 public class DrawBoard implements DrawComposant {
    public DrawBoard(LinkedList<DrawComposant> drawComposants) {
        this.drawComposants = drawComposants;
    }

    public LinkedList<DrawComposant> getDrawComposants() {
        return drawComposants;
    }

    public void setDrawComposants(LinkedList<DrawComposant> drawComposants) {
        this.drawComposants = drawComposants;
    }

    LinkedList<DrawComposant> drawComposants;
    @Override
    public void draw(Graphics g) {
        for (var drawComposant:
             drawComposants) {
            drawComposant.draw(g);
        }

    }
}
