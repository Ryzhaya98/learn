package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 3;
        int n = 0;
        int p = -1;
        System.out.println("Введите количество элементов массива");
        n = sc.nextInt();
        int[] x = new int[n];
        int[] res = new int[n+k];
        System.out.println();
        System.out.println("Введите желементы массива");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i=0; i<n; i++){
            if((i+k)< x.length){
                res[i]=x[i+k];
            }
            else {
                res[i]=x[p+1];
                p++;
            }
            System.out.print(res[i] + " ");
        }

    }
}