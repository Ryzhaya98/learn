package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> mult_arr = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ENter n");
        n = sc.nextInt();//10-13 раскоменть)) пжл
        System.out.print(Mult(n) + " ");
    }


    public static int Mult(int N) {

        if (N == 1) {
            return N;
        }
        if (N % 2 == 1) {
            return N * Mult(N - 1);

        } else
          return   Mult(N-1);
    }
}