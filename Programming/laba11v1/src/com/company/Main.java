package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n= sc.nextInt();
        Sum2(n);

    }





    public static int[][] Matrix(int n){
        Random rand = new Random();
        int [][] matrix = new int[n][n];

        for (int i=0; i<matrix.length; i++){
           for (int j=0; j<matrix[i].length; j++){
               matrix[i][j] = rand.nextInt(100);
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
        }

        return matrix;
    }

    public static void Sum2(int n){
        int sum = 0;
        int[][] matr = Matrix(n);
            for (int j=0; j<matr.length;j++){
                sum = sum+ matr[j][0];

            }
            System.out.println(sum);


    }
}
