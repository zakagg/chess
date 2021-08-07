package com.company.model.factory;

import com.company.model.Piece;

import java.util.LinkedList;

public class AllPiecesFactory {
    LinkedList<Piece> allPiece;

    public AllPiecesFactory(LinkedList<Piece> allPiece) {
        this.allPiece = allPiece;
    }

    public AllPiecesFactory() {

    }

    public LinkedList<Piece> createAllPieces()
    {
        this.allPiece=new LinkedList<>();
        AbstractPieceFactory concreteRooksFactory=new ConcreteRooksFactory();
        this.allPiece.add(concreteRooksFactory.createBlackPiece(0,0));
        this.allPiece.add(concreteRooksFactory.createBlackPiece(7,0));
        this.allPiece.add(concreteRooksFactory.createWhitePiece(0,7));
        this.allPiece.add(concreteRooksFactory.createWhitePiece(7,7));
        AbstractPieceFactory concreteKnightFactory=new ConcreteKnightFactory();
        this.allPiece.add(concreteKnightFactory.createBlackPiece(1,0));
        this.allPiece.add(concreteKnightFactory.createBlackPiece(6,0));
        this.allPiece.add(concreteKnightFactory.createWhitePiece(1,7));
        this.allPiece.add(concreteKnightFactory.createWhitePiece(6,7));
        AbstractPieceFactory concreteBishopFactory=new ConcreteBishopFactory();
        this.allPiece.add(concreteBishopFactory.createBlackPiece(2,0));
        this.allPiece.add(concreteBishopFactory.createBlackPiece(5,0));
        this.allPiece.add(concreteBishopFactory.createWhitePiece(2,7));
        this.allPiece.add(concreteBishopFactory.createWhitePiece(5,7));
        AbstractPieceFactory concreteQueenFactory=new ConcreteQueenFactory();
        this.allPiece.add( concreteBishopFactory.createBlackPiece(3,0));
        this.allPiece.add( concreteBishopFactory.createWhitePiece(3,7));
        AbstractPieceFactory concreteKingFactory=new ConcreteKingFactory();
        this.allPiece.add(concreteKingFactory.createBlackPiece(4,0));
        this.allPiece.add(concreteKingFactory.createWhitePiece(4,7));
        AbstractPieceFactory concretePawnFactory=new ConcretePawnFactory();
        this.allPiece.add(concretePawnFactory.createBlackPiece(0,1));
        this.allPiece.add(concretePawnFactory.createBlackPiece(1,1));
        this.allPiece.add(concretePawnFactory.createBlackPiece(2,1));
        this.allPiece.add(concretePawnFactory.createBlackPiece(3,1));
        this.allPiece.add(concretePawnFactory.createBlackPiece(4,1));
        this.allPiece.add(concretePawnFactory.createBlackPiece(5,1));
        this.allPiece.add(concretePawnFactory.createBlackPiece(6,1));
        this.allPiece.add(concretePawnFactory.createBlackPiece(7,1));
        this.allPiece.add(concretePawnFactory.createWhitePiece(1,6));
        this.allPiece.add(concretePawnFactory.createWhitePiece(2,6));
        this.allPiece.add(concretePawnFactory.createWhitePiece(3,6));
        this.allPiece.add(concretePawnFactory.createWhitePiece(4,6));
        this.allPiece.add(concretePawnFactory.createWhitePiece(4,6));
        this.allPiece.add(concretePawnFactory.createWhitePiece(5,6));
        this.allPiece.add(concretePawnFactory.createWhitePiece(6,6));
        this.allPiece.add(concretePawnFactory.createWhitePiece(7,6));
        return allPiece;
        
    }

}
