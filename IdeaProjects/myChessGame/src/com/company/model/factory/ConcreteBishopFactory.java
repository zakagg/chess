package com.company.model.factory;
import com.company.model.BlackBishop;
import com.company.model.BlackPiece;
import com.company.model.WhiteBishop;
import com.company.model.WhitePiece;

public class ConcreteBishopFactory implements AbstractPieceFactory{
    @Override
    public WhitePiece createWhitePiece(int x, int y) {
        return new WhiteBishop(x, y);
    }

    public BlackPiece createBlackPiece(int x, int y)
    {
        return new BlackBishop(x, y);
    }


}
