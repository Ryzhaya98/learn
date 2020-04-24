package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double A,B,C,D,x1,x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A ");
        A = sc.nextDouble();
        System.out.println("Enter B ");
        B = sc.nextDouble();
        System.out.println("Enter C ");
        C = sc.nextDouble();
        D = (Math.pow(B,2) - 4*A*C);
        if (D >= 0) {
            x1 = (-B + Math.sqrt(D)) / (2 * A);
            x2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("Первый корень уравнения" +x1);
            System.out.println("Второй корень уравнения" +x2);
        }
            else {
                System.out.println("No roots");
                return;
        }
    }
}
