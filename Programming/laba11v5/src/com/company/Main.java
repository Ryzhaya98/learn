package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  s,t;
        System.out.println("Enter s");
        s = sc.nextDouble();
        System.out.println("Enter t");
        t = sc.nextDouble();
        double fun;
        fun = Fun1(s,t) + Fun2(s,t);
        System.out.println(fun);

    }

    public static  double Fun1(double s, double t){
        double a =s;
        double b= -2*t;
        double c = 1.17;
        double fun1;
        fun1=(2*a-b - Math.sin(c))/(5+Math.abs(a));
        return fun1;
    }

    public static double Fun2(double s, double t){
        double a =2.2;
        double b= t;
        double c = s-t;
        double fun2;
        fun2=(2*a-b - Math.sin(c))/(5+Math.abs(a));
        return fun2;
    }
}
