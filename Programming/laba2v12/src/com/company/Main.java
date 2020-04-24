package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double с, d, x1,x2, D1, A;
	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter c");
	     double c = sc.nextDouble();
        System.out.println("Enter d");
         d = sc.nextDouble();
        D1 = (9 - 4*Math.abs(c*d));
        if (D1>=0){
            x1 = (3+Math.sqrt(D1))/2;
            x2 = (3-Math.sqrt(D1))/2;
            if (x1>x2){
                A = Math.pow(Math.sin(Math.abs(c*Math.pow(x1,3)+ d*Math.pow(x2,2)- (c*d))),3);
                System.out.println("A = " +A);
            }
            else {
                System.out.println("Error x1<x2");
            }
        }
        else {
            System.out.println("Error");
            return;
        }



    }
}
