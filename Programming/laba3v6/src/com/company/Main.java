package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double x,y,z,u;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        x = sc.nextInt();
        System.out.println("Enter y ");
        y = sc.nextDouble();
        System.out.println("Enter z ");
        z = sc.nextInt();
        if (x>y && x>z && y>z) {
            u = (Math.pow(x, 2) - (Math.pow(2, x) * z))*z / (x / z);
            System.out.println(" u = " +u);
        }
        else {
            u = (Math.pow(z, 2) - (Math.pow(2, x) * x)) / (z / x);
            System.out.println(" u = " +u);
            return;
        }
        if(x>y && x>z && z>y){
            u = (Math.pow(x, 2) - (Math.pow(2, x) * y)) / (x / y);
            System.out.println(" u = " +u);
        }
        else {
            u = (Math.pow(y, 2) - (Math.pow(2, x) * x)) / (y / x);
            System.out.println(" u = " +u);
            return;
        }
        if (z>x && z>y && x>y){
            u = (Math.pow(z, 2) - (Math.pow(2, x) * y)) / (z / y);
            System.out.println(" u = " +u);
        }
        else {
            u = (Math.pow(y, 2) - (Math.pow(2, x) * z)) / (y / z);
            System.out.println(" u = " +u);
            return;
        }
    }
}
