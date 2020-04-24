package com.company;
import javax.swing.*;
import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// объекта ввода
        System.out.println("Введите левый интервал:");
        double a = in.nextDouble();// ввод дабл
        System.out.println("Введите правый интервал:");
        double b = in.nextDouble();
        double x = 0;
        double E = 0.05;//эпсилон
        int c = 1;
        while (Math.abs(b-a) >= E)
        {
            System.out.println("x = " + x);
            x = (a + b) / 2;
            double f1 = F(x-E);//левое значение функции
            double f2 = F(x+E); // правое значение функции
            if (c * f1 < c * f2)
            {
                b = x;
            }
            else {
                a = x;
            }
        }
        x = (a+b)/2;

// System.out.println("asdasdasd" + Math.pow(8, 1./3));
        System.out.println("X = " + x);
        double FM = F((double)x);// экстремум
        System.out.println("Экстремум = " + FM);
        System.out.println();
        System.out.println();
        System.out.println("AAAAA" + Math.pow(3 * Math.pow(x,2) - Math.pow(x,3), 1/3));
    }


    public static double F(double x) {
        double res = Math.pow(3 * Math.pow(x,2) - Math.pow(x,3), 1./3);
        System.out.println(res);
        return res;// метод для функции
    }

    public static float F(float x) {
        float res = (float)Math.pow(3 * Math.pow(x,2) - Math.pow(x,3), 1/3);
        System.out.println(res);
        return res;// метод для функции
    }
}
