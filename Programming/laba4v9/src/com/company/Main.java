package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double s,v,t1,t2, v1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость самолета v = ");
        v =  sc.nextDouble();
        System.out.println("Введите расстояние s = ");
        s =  sc.nextDouble();
        System.out.println("Введите скорость встречного ветра не более 15м/с: ");
        v1 =  sc.nextDouble();
        if (v1==0) {
            t2= s/v;
            System.out.print("Время полета = " +t2);
        }
        else {
            for(double i =0.5; i <=v1; i+=0.5){
                t1 = s/(v-i);
                System.out.println("Время полета с учетом встречного ветра " +t1);
            }
        }

        }

    }

