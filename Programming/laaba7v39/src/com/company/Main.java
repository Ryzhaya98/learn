package com.company;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int m,n;
        System.out.print("Enter m = ");
        m =  sc.nextInt();
        System.out.print("Enter n = ");
        n =  sc.nextInt();
	    int [][] array = new int[m][n];

        System.out.println("Array...");
	    for (int i=0; i< array.length; i++) {
	        for (int j=0; j<array[0].length; j++){
	            array[i][j] = rand.nextInt(100);
	            System.out.print(array[i][j] + " ");
            }
	        System.out.println();
        }



	    int [] array_max = new int[m];
	    for (int i=0; i< array.length; i++){
            int max=0;
	        for (int j=0; j<array[0].length; j++){
	            if (max < array[i][j]){
	                max = array[i][j];
                }
            }
	        array_max[i]= max;
            System.out.print(array_max[i] + " ");
        }
	    System.out.println();
        int sum = 0;
	    for (int i = 0; i<array_max.length; i++){
	        sum = sum+ array_max[i];
        }
	    System.out.print("Summ max = " +sum);

    }
}
