package com.company.model.factory;

import com.company.model.Piece;

import java.util.LinkedList;

public class AllPiecesFactory {
    static LinkedList<Piece>  allPiece =new LinkedList<>();

    public AllPiecesFactory(LinkedList<Piece> allPiece) {
        this.allPiece = allPiece;
    }

    private AllPiecesFactory() {
        this.allPiece=new LinkedList <>();
    }
    public static LinkedList<Piece> getInstance()
    {
       return allPiece;
    }
    public static Piece getPiece(int x,int y)
    {
        for (var piece:
             allPiece) {
        if(piece.getX()==x && piece.getY()==y){
            System.out.println(piece);
            return piece;
        }
        }
        return  null;
    }

    public  static LinkedList<Piece> createAllPieces()
    {

        AbstractPieceFactory concreteRooksFactory=new ConcreteRooksFactory();
        allPiece.add(concreteRooksFactory.createBlackPiece(0,0));
        allPiece.add(concreteRooksFactory.createBlackPiece(7,0));
        allPiece.add(concreteRooksFactory.createWhitePiece(0,7));
        allPiece.add(concreteRooksFactory.createWhitePiece(7,7));
        AbstractPieceFactory concreteKnightFactory=new ConcreteKnightFactory();
        allPiece.add(concreteKnightFactory.createBlackPiece(1,0));
        allPiece.add(concreteKnightFactory.createBlackPiece(6,0));
        allPiece.add(concreteKnightFactory.createWhitePiece(1,7));
        allPiece.add(concreteKnightFactory.createWhitePiece(6,7));
        AbstractPieceFactory concreteBishopFactory=new ConcreteBishopFactory();
        allPiece.add(concreteBishopFactory.createBlackPiece(2,0));
        allPiece.add(concreteBishopFactory.createBlackPiece(5,0));
        allPiece.add(concreteBishopFactory.createWhitePiece(2,7));
        allPiece.add(concreteBishopFactory.createWhitePiece(5,7));
        AbstractPieceFactory concreteQueenFactory=new ConcreteQueenFactory();
        allPiece.add( concreteQueenFactory.createBlackPiece(3,0));
        allPiece.add( concreteQueenFactory.createWhitePiece(3,7));
        AbstractPieceFactory concreteKingFactory=new ConcreteKingFactory();
        allPiece.add(concreteKingFactory.createBlackPiece(4,0));
        allPiece.add(concreteKingFactory.createWhitePiece(4,7));
        AbstractPieceFactory concretePawnFactory=new ConcretePawnFactory();
        allPiece.add(concretePawnFactory.createBlackPiece(0,1));
        allPiece.add(concretePawnFactory.createBlackPiece(1,1));
        allPiece.add(concretePawnFactory.createBlackPiece(2,1));
        allPiece.add(concretePawnFactory.createBlackPiece(3,1));
        allPiece.add(concretePawnFactory.createBlackPiece(4,1));
        allPiece.add(concretePawnFactory.createBlackPiece(6,1));
        allPiece.add(concretePawnFactory.createBlackPiece(7,1));
        allPiece.add(concretePawnFactory.createBlackPiece(5,1));
        allPiece.add(concretePawnFactory.createWhitePiece(1,6));
        allPiece.add(concretePawnFactory.createWhitePiece(2,6));
        allPiece.add(concretePawnFactory.createWhitePiece(3,6));
        allPiece.add(concretePawnFactory.createWhitePiece(0,6));
        allPiece.add(concretePawnFactory.createWhitePiece(4,6));
        allPiece.add(concretePawnFactory.createWhitePiece(5,6));
        allPiece.add(concretePawnFactory.createWhitePiece(6,6));
        allPiece.add(concretePawnFactory.createWhitePiece(7,6));
        return allPiece;
        
    }

}
