package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int [] a = new int[20];
	int x;
	double res = 0;
        Random rand = new Random();
        for(int i=0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Enter x");
        x = sc.nextInt();
        for(int i=0; i < a.length; i++) {
            res = res + a[i]*Math.pow(x,i);
            System.out.println(a[i]*Math.pow(x,i));
        }
        System.out.println(" Result = " +res);
    }
}
