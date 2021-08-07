package com.company.vue;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        frame.setUndecorated(true);
        DrawComposant drawBlackCase=new DrawBlackCase(0,1);
        DrawComposant drawWhiteCase=new DrawWhiteCase(0,0);
        LinkedList<DrawComposant> allComposant=new LinkedList<>();
        allComposant.add(drawBlackCase);
        allComposant.add(drawWhiteCase);
        DrawComposant allBoard= new DrawBoard(allComposant);
        JPanel pn=new JPanel(){
            @Override
            public void paint(Graphics g)
            {
                allBoard.draw(g);
            }
        };
        frame.add(pn);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

}
