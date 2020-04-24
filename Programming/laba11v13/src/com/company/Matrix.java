package com.company;

import java.util.Random;

public class Matrix {




    public int [][] Matr (int a) {
        Random rand = new Random();
        int [][] matr = new int[a][a];
        for (int i =0; i<matr.length; i++){
            for (int j=0; j<matr[i].length; j++){
                matr[i][j] = rand.nextInt(100);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        return matr;
    }



    public int Sled (int [][] matr) {
        int sled=0;
        for (int i=0; i<matr.length; i++){
           sled += matr[i][i];
        }
        return sled;
    }




}
