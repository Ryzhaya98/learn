package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();
        int s=0;
        for ( int i=1; i<=n; i++){
            s = (3*i)+s;

        }
        System.out.println("S = " +s);
    }
}
