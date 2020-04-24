package com.company;

import java.util.Random;

public class Function {


    public  int [] Array (int n){
        Random rand = new Random();
        int[] array = new int[n];
        for (int i=0; i<array.length;i++){
            array[i]=rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public int Min_elem_array (int [] array) {
        int [] arr = array;
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (min> arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        return min;
    }


    public  int Max_elem_array (int []  array){
        int [] arr = array;
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }





}
