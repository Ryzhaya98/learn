package com.company;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = sc.nextInt();
        System.out.print(Sum(n) + " ");

    }
    public static int Sum (int N) {
        if (N ==1) {
            return 1;
        }
        return N+Sum(N-1);

    }

}
