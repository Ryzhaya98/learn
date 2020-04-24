package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [][] two_array =  new int[7][7];
        Random rand =  new Random();
        int max= two_array[0][0];

        for (int i =0; i<two_array.length; i++){
            for (int j = 0; j<two_array[0].length; j++){
                two_array[i][j] = rand.nextInt(100);
                System.out.print(" " + two_array[i][j]  + " ");
            }
            System.out.println();
        }
        System.out.println();
        int kmax=0;
        for (int i =0; i<two_array.length; i++){
            for (int j = 0; j<two_array[0].length; j++){
                if (two_array[i][j] > max){
                    max = two_array[i][j];
                    kmax=i+1;
                }
            }
        }
        System.out.println("Наибольший элемент = " + max + "в строке" + kmax);

        int min = two_array[0][0];
        int kmin=0;
        for (int i =0; i<two_array.length; i++){
            for (int j = 0; j<two_array[0].length; j++){
                if (two_array[i][j] < min){
                    min = two_array[i][j];
                    kmin = j+1;
                }
            }
        }
        System.out.println("Наименьший элемент = " + min + " в столбце" +kmin);
        int res=0;
        for (int i=0; i<two_array.length; i++){
            for (int j = 0; j<two_array[0].length; j++){
                res= res + two_array[kmax][i]*two_array[i][kmin];
            }
        }
        System.out.println("Result = " + res);

    }
}
