package com.company.controller;

import com.company.model.Piece;
import com.company.model.factory.AllPiecesFactory;

public class Game {
    private static int clickNumber=0;
    public static Piece pieceSelected;
    public static void play (int x,int y)
    {
        if(clickNumber==0) {
            pieceSelected=AllPiecesFactory.getPiece(x, y);
            if (pieceSelected != null) {
                clickNumber++;
            }
        }else
        {
            if (AllPiecesFactory.getPiece(x, y) == null) {
                System.out.println(pieceSelected);
                System.out.println(clickNumber);
                clickNumber = 0;
                pieceSelected.move(x,y);
            }
        }
    }
}
