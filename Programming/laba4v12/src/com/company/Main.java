package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double x,y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x от 0 до 2пи");
        x = sc.nextDouble();
        for (double i=0; i<=x; i+= (Math.PI)/6) {
            y = 0.5 + Math.sin(5*i);
            System.out.println("y = " +y);
        }
    }
}
