package com.company;

import java.util.Scanner;
//вторая лаба по яп 17 вариант
public class Main {


    private static double lineBC;
    private static double lineAB;
    private static double lineAC;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter AB");
        double lineAB = sc.nextInt();
        System.out.println("Enter AC");
        double lineAC = sc.nextInt();
        System.out.println("Enter BC");
        double lineBC = sc.nextInt();



        double cosA =  (Math.pow(lineAC, 2) + Math.pow(lineAB, 2)- Math.pow(lineBC,2))/(2*lineAB*lineBC);
        double arcCosA = Math.acos(cosA);
        System.out.println("CosA = " + cosA);
        System.out.println("arcCosA = " + arcCosA);
        double A = Math.toDegrees(arcCosA);
        System.out.println("A = " +A);



    }
}
