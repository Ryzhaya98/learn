package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] x = new int[10];
        int[] y = new int[10];
        int a=0;
        int b= 0;
        int count1=0, count2=0;
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(100);
            System.out.print(x[i] + "  ");
        }
        System.out.println();
        for (int j = 0; j < x.length; j++) {
            y[j] = rand.nextInt(100);
            System.out.print(y[j] + "  ");
        }
        System.out.println();
        for (int i = 0; i < x.length; i +=2) {
            a = a + x[i]* y[i];
            System.out.print(x[i]* y[i] + " ");
        }
        System.out.println();
        System.out.println(a + " ");
        for (int i = 1; i < x.length; i +=2) {
            b = a + x[i]* y[i];
            System.out.print(x[i]* y[i] + " ");
        }
        System.out.println();
        System.out.println(b + " ");

        double res = b/a;
        System.out.println(res);

    }
}
