package com.company.controller;

import com.company.model.factory.AllPiecesFactory;
import com.company.vue.DrawBoard;
import com.company.vue.DrawComposant;
import com.company.vue.DrawOnePiecesImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Pn {
    public static JPanel build() throws IOException {
        LinkedList<DrawComposant> allComposant=new LinkedList<>();
        DrawComposant allBoard= new DrawBoard(allComposant);
        DrawBoard myBorad=(DrawBoard) allBoard;
        myBorad.build();
        BufferedImage all= ImageIO.read(new File("C:\\Users\\zaki\\IdeaProjects\\myChessGame\\src\\com\\company\\vue\\chess.png"));
        DrawOnePiecesImage drawOnePiecesImage =new DrawOnePiecesImage();
        drawOnePiecesImage.build();
        AllPiecesFactory.createAllPieces();
        var allp=AllPiecesFactory.getInstance();
        System.out.println(allp.size());
        JPanel pn=new JPanel(){
            @Override
            public void paint(Graphics g)
            {
                myBorad.draw(g);
                for ( var instance: allp)
                {
                    g.drawImage(drawOnePiecesImage.getImgs()[instance.getImageToDraw()], instance.getxPosition(), instance.getyPosition(), this);
                }
            }
        };
        return pn;
    }
}
