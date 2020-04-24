package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rand = new Random();
        int m, n;
        System.out.print("Enter m ");
        m = sc.nextInt();
        System.out.print("Enter n ");
        n = sc.nextInt();
        int [][] matrix = new int[m][n];
            for (int i=0;i<matrix.length; i++){
                for (int j=0; j<matrix[0].length; j++){
                    matrix[i][j] = rand.nextInt(100);
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println();

            for (int i=0; i<matrix[0].length; i++) {
                int sr_arih=0;
                if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                        sr_arih = matrix[j][i] + sr_arih;
                    }
                }
                else
                {
                    continue;
                }
                System.out.println(sr_arih/m);
            }

    }
}
