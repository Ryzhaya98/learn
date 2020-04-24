package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double x = 0,y,y1;
	int a;
        Scanner sc= new Scanner(System.in);
	    System.out.println("Введите 1 для ввода числа x");
        System.out.println("Введите 2 для просмотра исходных данных");
        System.out.println("Введите 3 для выполнения программы");
        System.out.println("Введите 4 для выхода из программы");
        a = sc.nextInt();
        switch (a) {
            case 1: System.out.println("Enter x");
                x = sc.nextDouble();
                break;

            case 2: System.out.println("x = " +x);
            break;
            case 3:
                while (x>=0 && x<=1) {
                y = (x-1)/(2*Math.pow(x,2)+3);
                System.out.println("y = " +y);
                x +=0.1;

            }
                while (1<x && x<=10 ){
                    y1= 1.05*Math.pow((x-1),2);
                    System.out.println("y = " +y1);
                    x +=0.1;

                }
                break;
            case 4:
                break;
        }


    }
}
