package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату х для точки а");
        double x_a = sc.nextDouble();
        System.out.println("Введите координату х для точки в");
        double x_b = sc.nextDouble();
        System.out.println("Введите координату х для точки с");
        double x_c = sc.nextDouble();
        System.out.println("Введите координату у для точки а");
        double y_a = sc.nextDouble();
        System.out.println("Введите координату у для точки в");
        double y_b = sc.nextDouble();
        System.out.println("Введите координату у для точки с");
        double y_c = sc.nextDouble();
        Triangle triangle = new Triangle(x_a, x_b,x_c,y_a,y_b,y_c);
        triangle.checkExist();
		
    }
}
