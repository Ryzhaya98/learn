package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand= new Random();
        int n =0, p=-1,k=0;
        System.out.print("Введите количество элементов массива:");
        n = sc.nextInt();
        int[] x = new int[n];
        int[] res = new int[n+k];
        System.out.println();
            for (int i=0; i<x.length; i++){
                x[i] = rand.nextInt(100);
                System.out.print(x[i] + " ");
            }
        System.out.println();
        System.out.println("Введите на сколько позиций нужно сдвинуть элементы массива влево: ");
        k =sc.nextInt();
            for (int i=0; i<x.length;i++){
                if(k<n){
                    if((i+k)<x.length){
                        res[i]=x[i+k];
                    }
                    else {
                        res[i]=x[p+1];
                        p++;
                    }
                  //  System.out.print(res[i] + " ");
                }
                else {
                    int a = k%n;
                    if ((i+a)<x.length){
                        res[i]=x[i+a];
                    }
                    else {
                        res[i]=x[p+1];
                        p++;
                    }
                }
                System.out.print(res[i] + " ");
            }
    }
}
