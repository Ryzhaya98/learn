package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k=30;
        Function function = new Function();
        System.out.println("Enter n");
        n = sc.nextInt();
       int[] array_n = function.Array(n);
        System.out.println("Enter m");
        m = sc.nextInt();
        int[] array_m = function.Array(m);
        int[] array_k = function.Array(k);

        int min_n, min_m, min_k;
        min_n = function.Min_elem_array(array_n);
        min_m = function.Min_elem_array(array_m);
        min_k = function.Min_elem_array(array_k);

        int max_n, max_m, max_k;
        max_n = function.Max_elem_array(array_n);
        max_m = function.Max_elem_array(array_m);
        max_k = function.Max_elem_array(array_k);

        int T;
         if (Math.abs(min_n)>10){
             T = min_n+min_m+min_k;
         }
         else {
             T = 1 + max_k;
         }

         System.out.println(T);

    }
}
