package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double a, b, c,g;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        a = sc.nextDouble();
        System.out.println("Enter b");
        b = sc.nextDouble();

        c = (a+b)/2;
        System.out.println("Еhe arithmetic mean = " +c);
        g = Math.sqrt(a*b);
        System.out.println("The geometric mean = " +g);

        System.out.println("Остаток от деления a на b = " +(a%b));
        System.out.println("Остаток от деления b на a = " +(b%a));

    }
}
