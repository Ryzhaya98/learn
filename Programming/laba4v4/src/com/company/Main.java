package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int greatThenZero(int n){
        if(n < 0)
            throw new IllegalArgumentException();
        else
            return n;
    }


    public static void main(String[] args) {
        int n=0;
        double u = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        try{
            n = sc.nextInt();
            greatThenZero(n);
        }
        catch (IllegalArgumentException | InputMismatchException e) {
            e.printStackTrace();
            //System.out.println("Enter n>0 ");
        }


        for (int i=1; i<=n; i++ ) {
             u = u*(1 + 1/Math.pow(i,2));
            System.out.println("F(x) = " +u);
        }
    }
}
