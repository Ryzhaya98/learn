package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону а кирпича");
        a = sc.nextInt();
        System.out.println("Введите сторону b кирпича");
        b = sc.nextInt();
        System.out.println("Введите сторону c кирпича");
        c = sc.nextInt();
        System.out.println("Введите сторону x отверстия");
        x = sc.nextInt();
        System.out.println("Введите сторону y отверстия");
        y = sc.nextInt();

        if ((a == x) && (b==y) || (a == y) && (b == x) || (a==x && (c==y) || (a == y) && (c == x) || (b==y) && (c==x) || (b==x) && (c==y)) ) {
            System.out.println("Да, кирпич пройдет в отверстие");
        } else {
            System.out.println("Нет, кирпич нет пройдет в отверстие");
            return;

        }
    }
}
