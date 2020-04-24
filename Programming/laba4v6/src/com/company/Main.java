package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i");
        i = sc.nextInt();
        double f = 0;
        for (int j=0; j<=i; j++) {
            f = f +  (1/(Math.pow(j,2) + (j+1)));

        }
        System.out.println("f = " +f);
    }
}
