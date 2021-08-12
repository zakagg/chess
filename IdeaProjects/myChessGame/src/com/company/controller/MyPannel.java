package com.company.controller;

import com.company.model.Piece;
import com.company.model.factory.AllPiecesFactory;
import com.company.vue.DrawBoard;
import com.company.vue.DrawComposant;
import com.company.vue.DrawOnePiecesImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class MyPannel {

    public void paint() throws IOException {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        frame.setUndecorated(true);

        frame.add(Pn.build());
        frame.setDefaultCloseOperation(3);
        frame.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {


                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        Game.play(e.getX()/DrawComposant.SIZE,e.getY()/DrawComposant.SIZE);
                        //System.out.println(e.getX() + "  "+e.getY());
                        frame.repaint();
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                });
        frame.setVisible(true);
    }
}
