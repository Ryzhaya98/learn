package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextDouble();
        System.out.println("Enter b");
        b = sc.nextDouble();
        System.out.println("Enter c");
        c = sc.nextDouble();
        if (a>=0){
            System.out.println(" a^2 = " +Math.pow(a,2));
        }
        else {
            System.out.println("Oooops a<0");
            return;
        }
        if (b>0){
            System.out.println(" b^2 = " +Math.pow(b,2));
        }
        else {
            System.out.println("Oooops b<0");
            return;
        }
        if (c>0){
            System.out.println(" c^2 = " +Math.pow(c,2));
        }
        else {
            System.out.println("Oooops c<0");
            return;
        }

    }
}
