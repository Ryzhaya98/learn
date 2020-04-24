package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int [] x = new int[20];
	int [] y = new int[20];
	double [] s = new double[40];
	int count1 =0 , count2=0;
	double max =0;
	int max_x=0, max_y = 0;
        Random rand = new Random();
        for (int i=0; i<x.length; i++){
            x[i] = rand.nextInt(100);
            System.out.print(Arrays.toString(new int[]{x[i]}));
        }
        System.out.println();
        for (int j=0; j< y.length; j++){
            y[j] = rand.nextInt(100);
            System.out.print(Arrays.toString(new int[]{y[j]}));
        }
        System.out.println();

        for(int i =count1; i<x.length; i++) {
            count1++;
            for (int j = count2; j < y.length; j++) {
                double d;
                d = Math.sqrt(Math.pow((x[i] - x[j]), 2) + Math.pow((y[i] - y[j]), 2));
                if (d>max){
                    max=d;
                    max_x=i;
                    max_y=j;
                }
                System.out.println(d + "  ");
                //s[i + j] = d;
                // System.out.println();
                //System.out.println(Arrays.toString(new double[]{s[i + j]}));
                count2++;
            }
        }
        System.out.println("Максимальное расстояние" + max);
        System.out.println("координата х " + max_x + " Координата у" + max_y);




        }
    }

