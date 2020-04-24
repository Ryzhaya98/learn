package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int n = 0;
        System.out.println("Введите размер массива n = ");
        n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Введите элементы массива ");
        for (int i =0; i<array.length; i++){
            array[i] = sc.nextInt();

          // System.out.print("Исходный массив:  " + array[i] + " ");
        }
        System.out.println();
        for (int i=0; i<n;i++ ) {
            System.out.print( array[i] + " ");
        }
        System.out.println();
        for (int i=0; i< (n-1); i++){
            if (array[i] < array[i+1]) {
                t = true;
            }
            else {
                t = false;
                System.out.println(t);
                return;
            }
        }
       System.out.println(t);
    }
}
