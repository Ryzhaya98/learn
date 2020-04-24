package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name proc");
        String name_proc = sc.next();
        System.out.println("Введите объем опертиавной памчти");
        double ozu = sc.nextDouble();

        MotherBoard motherBoard = new MotherBoard(name_proc,ozu);
        System.out.println("Вы выбрали: " + motherBoard.getProc().getName_proc() + " " + motherBoard.getOZU());

    }
}
