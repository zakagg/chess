package com.company.vue;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawOnePiecesImage {


    private BufferedImage all;
    private Image imgs[]=new Image[12];
    public Image[] getImgs() {
        return imgs;
    }
    public Image[] build()
    {
        try {
            this.all=ImageIO.read(new File("C:\\Users\\zaki\\IdeaProjects\\myChessGame\\src\\com\\company\\vue\\chess.png"));
            int ind=0;
            for(int y=0;y<400;y+=200)
                for(int x=0;x<1200;x+=200){
                    this.imgs[ind]=this.all.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                    ind++;
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.imgs;
    }


}
