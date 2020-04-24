package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double l,S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l ");
        l = sc.nextDouble();
        S = (Math.pow(l,2))/(4* Math.PI);
        System.out.println("The area of a circle = " +S);
    }
}
