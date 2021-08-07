package com.company.model.factory;

import com.company.model.BlackPiece;
import com.company.model.WhitePiece;

public interface AbstractPieceFactory {
    public WhitePiece createWhitePiece(int x, int y);
    public BlackPiece createBlackPiece(int x , int y);
}
