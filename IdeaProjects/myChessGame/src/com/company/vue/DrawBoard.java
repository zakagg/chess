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
    public LinkedList<DrawComposant> build(){

        boolean is_black=true;
        DrawComposant drawCase;
        for (int i=0;i<8;i++)
        {
            for (int j=0;j<8;j++)
            {  if(is_black) {
                    drawCase = new DrawBlackCase(i, j);
            }
            else {
                    drawCase = new DrawWhiteCase(i, j);
            }
            this.drawComposants.add(drawCase);
            is_black=!is_black;
            }
            is_black=!is_black;
        }
        return this.drawComposants;
    }
}
