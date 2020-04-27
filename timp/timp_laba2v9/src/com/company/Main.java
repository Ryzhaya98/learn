package com.company;

import java.util.Scanner;

public class Main {

    static int result;
    public static void main(String[] args) {
        StringBuilder str_posl = new StringBuilder("1 2 3 4 5 6 7 8 9 10");
        String[] arr = str_posl.toString().split(" ");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = sc.nextInt();
        System.out.println(Posl(n,0,arr));
    }

    public static String Posl(int N, int count, String[] arr) {
        if (count==N){
            count -=1;
            return arr[count];
        }
        else
        {
            count += 1;
            return Posl(N, count, arr);
        }
    }



}
