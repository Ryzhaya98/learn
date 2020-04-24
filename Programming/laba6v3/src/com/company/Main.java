package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter размер массива n");
        int n = sc.nextInt();
	    int [] array = new int[n];
        Random rand = new Random();
        for (int i =0; i< array.length; i++) {
            array[i] = rand.nextInt();
            System.out.print(Arrays.toString(new int[]{array[i]}));

//            if (array[i] < 0) {
//                System.out.println(array[i]);
 //           }
        }
        System.out.println();
        for (int i=0; i < array.length; i++) {
            if (array[i]<0){
                System.out.println(array[i]);
            }
        }

    }
}
