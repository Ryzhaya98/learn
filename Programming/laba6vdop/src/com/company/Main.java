package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n=0;

        System.out.print("Enter n ");
        n = sc.nextInt();
        int[] A = new int[n/2];
        int[] B = new int[n];
	    int [] array= new int[n];

	    for(int i=0; i<array.length; i++){
	        array[i]= rand.nextInt(100);
	        System.out.print(array[i] + " ");
        }
	    System.out.println();
	    for(int i=0; i<(array.length/2); i++ ){
	        A[i]=array[i];
	        System.out.print(A[i]+ " ");
        }
        System.out.println();
	    for(int i = (array.length/2); i<array.length; i++){
	        B[i]=array[i];
	        System.out.print(B[i] + " ");
        }

    }
}
