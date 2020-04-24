package com.company;

public class Main {

    public static void main(String[] args) {
	int n=5;
	double [] array1= new double[n];
	double [] array2 = new double[3*n];

	    for (int i=0; i< array1.length; i++) {
	    	array1[i] = Math.random();
	    	System.out.print(array1[i] + " ");
    }
	    System.out.println();

	    for (int i=0; i<array2.length;i++){
	        array2[i] = Math.random();
	        System.out.print(array2[i] + " ");
        }//не делаю этот вариант

    }
}
