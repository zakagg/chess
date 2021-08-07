package com.company.model.factory;

import com.company.model.BlackKing;
import com.company.model.BlackPiece;
import com.company.model.WhiteKing;
import com.company.model.WhitePiece;

public class ConcreteKingFactory implements AbstractPieceFactory {
    @Override
    public WhitePiece createWhitePiece(int x, int y) {
        return new WhiteKing(x,y);
    }

    @Override
    public BlackPiece createBlackPiece(int x, int y) {
        return new BlackKing(x,y);
    }
}
