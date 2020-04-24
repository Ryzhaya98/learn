package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 5;
	int [][] array = new int[n][n];
	for(int i =0; i< array.length; i++){
	    for (int j=0; j< array.length-i; j++){
	        array[i][j] = 1;
	        array[n-i-1][j]=1;

        }
    }
	for (int i=0; i<array.length; i++){
	    for (int j=0; j< array.length; j++) {
            System.out.print(" " + array[i][j]);
        }
		System.out.println();
    }
    }
}
