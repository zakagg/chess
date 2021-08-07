package com.company.model.factory;

import com.company.model.BlackPawn;
import com.company.model.BlackPiece;
import com.company.model.WhitePawn;
import com.company.model.WhitePiece;

public class ConcretePawnFactory implements AbstractPieceFactory {
    @Override
    public WhitePiece createWhitePiece(int x, int y) {
        return new WhitePawn(x,y);
    }

    @Override
    public BlackPiece createBlackPiece(int x, int y) {
        return new BlackPawn(x,y);
    }
}
