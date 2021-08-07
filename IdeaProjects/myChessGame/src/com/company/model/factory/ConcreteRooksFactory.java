package com.company.model.factory;
import com.company.model.BlackPiece;
import com.company.model.BlackRooks;
import com.company.model.WhitePiece;
import com.company.model.WhiteRooks;

public class ConcreteRooksFactory implements AbstractPieceFactory {
    @Override
    public WhitePiece createWhitePiece(int x, int y) {
        return new WhiteRooks(x,y);
    }

    @Override
    public BlackPiece createBlackPiece(int x, int y) {
        return new BlackRooks(x,y);
    }
}
