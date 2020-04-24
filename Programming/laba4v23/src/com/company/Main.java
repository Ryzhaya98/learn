package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double a,f,n,h;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter n");
	n = sc.nextDouble();
        System.out.println("Enter a");
        a = sc.nextDouble();
        System.out.println("Enter h");
        h = sc.nextDouble();
        f=0;
	for (int i=0; i<=n; i++) {
        f = f + ( Math.pow(a,2)+ i*h)/(a+ i*h);
        System.out.println("F = " +f);
        }

    }
}
