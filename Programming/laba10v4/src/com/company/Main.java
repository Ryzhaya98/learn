package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Adress adress = new Adress();

           int a =0;
           do {
               System.out.println("Нвжмите 1 чтобы ввести/изменить название улицы");
               System.out.println("Нажмите 2 чтобы ввести/изменить номер дома");
               System.out.println("Нажмите 3 чтобы ввести/изменить ниндекс");
               System.out.println("Нажмите 4, чтоы показать адрес полностью");
               System.out.println("Нажмите 5 чтобы выйти из меню");
               a = sc.nextInt();
               switch (a) {
                   case 1: System.out.println("Введите улицу организации");
                       String street = sc.next();
                       adress.setStreet(street);
                        break;
                   case 2:     System.out.println("Введите номер дома");
                       String nomer_doma = sc.next();
                       adress.setNomer_doma(nomer_doma);
                       break;
                   case 3:    System.out.println("Введите индекс");
                       int index = sc.nextInt();
                       adress.setIndex(index);
                       break;
                   case 4:
                       System.out.println("Нажмите 4, чтоы показать адрес полностью");
                       System.out.println("Адрес вашей организации: " + adress.getStreet() + " " + adress.getNomer_doma() + " " + adress.getIndex());
                       break;
                   case 5:
                       break;
               }

           }
           while (a<5);







//        System.out.println("Введите улицу организации");
//        String street = sc.next();
//        System.out.println("Введите номер дома");
//        String nomer_doma = sc.next();
//        System.out.println("Введите индекс");
//        int index = sc.nextInt();
//
//        Adress adress = new Adress(street,nomer_doma,index);
//        System.out.println("Адрес вашей организации: " + adress.getStreet() + " " + adress.getNomer_doma() + " " + adress.getIndex());
    }
}
