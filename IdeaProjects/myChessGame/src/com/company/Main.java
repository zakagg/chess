package com.company;

import com.company.model.Piece;
import com.company.model.factory.AllPiecesFactory;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Piece> allPiecesFactory=AllPiecesFactory.getInstance();
        var allp=AllPiecesFactory.createAllPieces();
        System.out.println(allp);


    }
}
