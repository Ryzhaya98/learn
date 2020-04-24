package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int A;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A");
	A = sc.nextInt();
	//System.out.println("Делители числа " +A + " - ");
        for(int i=1; i<=A; i++) {
            if ((A%i)==0) {
                System.out.println("Делители числа " +A + " - " +i);
            }

        }

    }
}
