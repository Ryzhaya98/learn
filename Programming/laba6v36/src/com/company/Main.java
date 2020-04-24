package com.company;

import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Random rand = new Random();
	double [] b = new double[12];
	double [] array = new double[12];
	for(int i=0; i< array.length; i++) {
	    array[i] = rand.nextInt();
	    System.out.print(array[i] + " ");
    }
		double min = array[0];
		System.out.println();
	for (int i =1; i< array.length; i++) {
		if (min > array[i]){
			min = array[i];
		}
	}
		System.out.print(Math.pow(min,2));
		System.out.println();
		for (int i=0; i< array.length; i++){
			b[i] = Math.pow(array[i], 2);
			System.out.print(b[i]+ " ");
		}
		System.out.println();
		double min2 = b[0];
		for (int i =1; i< array.length; i++) {
			if (min2 > b[i]){
				min2 = b[i];
			}
		}
			System.out.print(min2);
			System.out.println();
			System.out.println("Результат равено = "+ (Math.pow(min,2)-min2));
    }
}
