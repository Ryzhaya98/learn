package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "вафва ойо конечно валя программирует как всегда ночью надо спать";
        String [] str_array = str.split(" ");
        for (int i=0; i<str_array.length; i++){
            System.out.println(str_array[i]);
        }
        System.out.println();

        for (int i=0; i<str_array.length; i++){
            for (int j=1; j<str_array[i].length(); j++){
                if (str_array[i].charAt(0)==str_array[i].charAt(j)){
                    System.out.println(str_array[i]);
                }
            }
        }
    }
}
