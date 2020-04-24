package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
		Random rand = new Random();
        int n =3;
	    double [] array = new double[n];

	    for(int i=0; i<array.length; i++){
	        array[i] = rand.nextDouble();
	        System.out.print(array[i] + " ");
        }
	    System.out.println();

	    for(int i=0; i<array.length-1; i++){
	        if(array[i] < array[i+1]) {
	            System.out.println("Массив не упорядочен по убыванию");
	            return;
            }
        }
		System.out.println("Массив  упорядочен по убыванию");
    }
}
