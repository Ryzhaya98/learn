package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        double res = Math.pow(Math.max(Math.max(x,y),z),2) - Math.pow(2,x) * Math.min(Math.min(x,y),z)/(Math.max(Math.max(x,y),z)/Math.min(Math.min(x,y),z));
        System.out.println(res);
    }
}
