package com.company.vue;

import javax.swing.*;
import java.awt.*;

public class MyPannel extends JPanel {
    DrawComposant allBoard;
    public MyPannel(DrawBoard allBoard)
    {
        this.allBoard=allBoard;
    }

    public void paint(Graphics g)
    {
        allBoard.draw(g);
    }


}
