package com.company.model.factory;

import com.company.model.*;

public class ConcreteKnightFactory implements AbstractPieceFactory {

    @Override
    public WhitePiece createWhitePiece(int x, int y)
    {
        return new WhiteKnight(x,y);
    }

    @Override
    public BlackPiece createBlackPiece(int x, int y) {
        return new BlackKnight(x,y);
    }
}
