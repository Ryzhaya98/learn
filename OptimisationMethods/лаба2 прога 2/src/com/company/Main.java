package com.company;
import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Введите левый интервал");
        double a;
        a = in.nextDouble();
        System.out.println("Введите правый интервал");
        double b;
        b = in.nextDouble();
        int c;

        System.out.println("Максимум или минимум? -1(Максимум), 1(минимум)");
        c = in.nextInt();
        double E = 0.05;
        double xl = a + 0.382*(b - a);
        double xp = b - 0.382*(b - a);

        while (Math.abs(b-a) > E ) {
            xl = a + 0.382*(b - a);
            xp = b - 0.382*(b - a);
            double fl = F(xl);
            double fp = F (xp);
            if (c*fl <= c*fp) {
                b = xp;

            }
            else {
                a = xl;
            }


        }
            double x = (b + a)/2;

        System.out.println("x = " + x);
        System.out.println("Экстремум " + F(x));

    }
    public static double F (double x) {
        return Math.pow(3*Math.pow(x,2) - Math.pow(x, 3),1./3);
    }
}
