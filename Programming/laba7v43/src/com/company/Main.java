package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int m, n,k;
        System.out.print("Enter m = ");
        m = sc.nextInt();
        System.out.print("Enter n = ");
        n = sc.nextInt();
        int [][] matrix = new int[m][n];
             for (int i=0; i<matrix.length; i++){
                for (int j =0; j< matrix[i].length; j++){
                matrix [i][j] = rand.nextInt(100);
                System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
             }
        System.out.print("Enter k ");
             k = sc.nextInt();
             int min = matrix[0][k];
             for (int i=0; i<matrix.length; i++){
                 if (min > matrix[i][k]) {
                     min = matrix[i][k];
                 }
             }
             System.out.print(min);
    }
}
