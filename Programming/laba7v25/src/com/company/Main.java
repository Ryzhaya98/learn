package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	int [][] array = new int[5][6];
//        Random rand = new Random();
//        for (int i=0; i<array.length; i++){
//            for (int j=0; j<array[0].length; j++){
//                array[i][j] = rand.nextInt(100);
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int [] array_sum = new int[5];
//        for (int i=0; i<array.length; i++){
//            int sum = 0;
//            for (int j=0; j<array[0].length; j++){
//                array_sum[i] += array[i][j];
//
//            }
//            System.out.print(array_sum[i] + " ");
//        }
//        System.out.println();
//        //int [] array_sum_sort = new int[5];
//
//        for(int i = array_sum.length-1; i >= 0 ; i--){
//            for(int j = 0 ; j < i ; j++){
//                if( array_sum[j] < array_sum[j+1] ){
//                    int tmp = array_sum[j];
//                    array_sum[j] = array_sum[j+1];
//                    array_sum[j+1] = tmp;
//                }
//
//            }
//            System.out.print(array_sum[i] + " " );
//        }



        ///Shama

        int [][] array = new int[5][7];
        Random rand = new Random();
        for (int i =0; i< array.length; i++){
            for (int j=0; j< array[0].length-1; j++){
                array[i][j] = rand.nextInt(100);
             //   System.out.print(array[i][j] + " ");
            }
           // System.out.println();
        }
        for (int i=0; i<array.length; i++){
            int sum = 0;
            for (int j=0; j<array[0].length-1; j++){
                sum = sum+ array[i][j];
            }
            array[i][6] = sum;
        }

        System.out.println("Array......");
        for (int i = 0; i<array.length; i++){
            for (int j=0; j<array[0].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for(int i =0; i < array.length - 1; i++)
        {
            for (int j =0; j < array.length - 1; j++){
                if(array[j][6] > array[j + 1][6])
                {
                    int [] tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        System.out.println("Sorted array....");
        for(int i =0; i < array.length; i++)
        {
            for(int j =0; j <array[0].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
