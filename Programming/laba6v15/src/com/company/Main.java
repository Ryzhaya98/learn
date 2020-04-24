package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n=0,y,k;
        System.out.print("Введите размер массива, n = ");
        n= sc.nextInt();
        int [] array = new int[n];
        for (int i=0; i <array.length; i++){
            array[i]= rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Введите число: ");
        y = sc.nextInt();
        System.out.println();
        for (int i=0; i< array.length; i++){
            if(y== array[i]){
                System.out.print("K = " + i);
                    return;
            }
        }
        System.out.println("k = " + (n+1));
    }
}
