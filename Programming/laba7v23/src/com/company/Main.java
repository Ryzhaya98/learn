package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n=4;
//        System.out.println(" Enter n");
//        n = sc.nextInt();
	    int [][] A = {
	            {1,2,2,1},
                {1,3,4,5},
                {1,1,1,1},
                {7,8,5,6},
        };
	    for (int i =0; i<A.length; i++){
	        for (int j=0; j<A[0].length; j++){
	            System.out.print(A[i][j] + " ");
            }
	        System.out.println();
        }

	    boolean [] B = new boolean[n];
 	    for (int i=0; i<A.length; i++){
	        for (int j=0; j<A[0].length; j++){
	            if (A[i][j] !=A[i][n-1-i]){
	                B[i] = false;
                }
	            else {
	                B[i]=true;
                }
            }
	        System.out.print(B[i] + " ");
        }
    }
}
