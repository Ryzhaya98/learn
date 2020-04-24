package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        x = sc.nextInt();
        System.out.println("Enter y");
        y = sc.nextInt();
        System.out.println("Enter z");
        z = sc.nextInt();
        if (x!=y && x!=z && z!=y) {
            int min = Math.min(Math.min(x,y),z);
            System.out.println(" x = " + min);
            System.out.println(" y = " + min);
            System.out.println(" z = " + min);
        }
        else {
            System.out.println("Все числа равны");
            return;
        }

    }
}
