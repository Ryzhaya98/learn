package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = sc.nextInt();
        System.out.println(Sum_even(n));
    }

    public static int Sum_even(int N){

        if (N==2) {
            return 2;
        }
        if (N %2 == 0){
            return N+Sum_even(N-1);
        }else
         return    Sum_even(N-1);
    }
}
