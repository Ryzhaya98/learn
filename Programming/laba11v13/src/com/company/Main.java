package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 5, b=6;
	Matrix matrix = new Matrix();
	int [][] A = matrix.Matr(a);
	System.out.println();
	int [][] B =  matrix.Matr(b);
	System.out.println();


	int sled_a, sled_b;
	 sled_a = matrix.Sled(A);
	 sled_b = matrix.Sled(B);

    int sum;

    sum = (sled_a+sled_b)/2;

    System.out.println(sum);

    }
}
