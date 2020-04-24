package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double x =0;
	int a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите 1 для ввода х");
            System.out.println("Введите 2 для вычисления функции s ");
            System.out.println("Введите 3 для вычисления фукгции р");
            System.out.println("Введите 4 для выхода из программы");
            a = sc.nextInt();
            switch (a) {
                case 1: System.out.println("Enter x");
                    x = sc.nextInt();
                    break;//не понятно
                case 2:   double s=0;
                    for (double i=1; i<=6; i++){
                        s = s+(x-Math.pow(2,i));
                        System.out.println("s = " +s);
                    }
                    break;
                case 3:
                    double p=1;
                    for (double j=1; j<=5;j++){
                        p= p*(x-(Math.pow(2,j)-1));
                        System.out.println("p = " +p);
                    }
                    break;
                case 4:
                    System.out.println("Выход из программы");
                    break;

            }
        }
        while (a<4);
//        System.out.println("Введите 1 для ввода х");
//        System.out.println("Введите 2 для вычисления функции s ");
//        System.out.println("Введите 3 для вычисления фукгции р");
//        System.out.println("Введите 4 для выхода из программы");
//        a = sc.nextInt();
//        switch (a) {
//            case 1: System.out.println("Enter x");
//                x = sc.nextInt();
//                System.out.println("Введите 1 для ввода х");
//                System.out.println("Введите 2 для вычисления функции s ");
//                System.out.println("Введите 3 для вычисления фукгции р");
//                System.out.println("Введите 4 для выхода из программы");
//                a = sc.nextInt();
//                break;//не понятно
//            case 2:   double s=0;
//                for (double i=1; i<=6; i++){
//                    s = s+(x-Math.pow(2,i));
//                    System.out.println("s = " +s);
//                }
//                System.out.println("Введите 1 для ввода х");
//                System.out.println("Введите 2 для вычисления функции s ");
//                System.out.println("Введите 3 для вычисления фукгции р");
//                System.out.println("Введите 4 для выхода из программы");
//                a = sc.nextInt();
//                break;
//            case 3:
//                double p=1;
//                for (double j=1; j<=5;j++){
//                    p= p*(x-(Math.pow(2,j)-1));
//                }
//                System.out.println("p = " +p);
//                System.out.println("Введите 1 для ввода х");
//                System.out.println("Введите 2 для вычисления функции s ");
//                System.out.println("Введите 3 для вычисления фукгции р");
//                System.out.println("Введите 4 для выхода из программы");
//                a = sc.nextInt();
//                break;
//            case 4:
//                System.out.println("Выход из программы");
//                break;
//
//        }


    }
}
