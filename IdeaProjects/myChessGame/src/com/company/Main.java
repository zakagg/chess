package com.company;

import com.company.model.factory.AllPiecesFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AllPiecesFactory allPiecesFactory=new AllPiecesFactory();
        var allp=allPiecesFactory.createAllPieces();
        System.out.println(allp);


    }
}
