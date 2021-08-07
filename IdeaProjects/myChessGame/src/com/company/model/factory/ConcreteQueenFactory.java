package com.company.model.factory;

import com.company.model.BlackPiece;
import com.company.model.BlackQueen;
import com.company.model.WhitePiece;
import com.company.model.WhiteQeen;

public class ConcreteQueenFactory implements AbstractPieceFactory{
    @Override
    public WhitePiece createWhitePiece(int x, int y) {
        return new WhiteQeen(x,y);
    }

    @Override
    public BlackPiece createBlackPiece(int x, int y) {
        return new BlackQueen(x,y);
    }
}
