package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "валя играет паап говорит урру нет да урру нет урру";
        String [] str_array = str.split(" ");
        for (int i=0; i<str_array.length; i++){
            System.out.println(str_array[i]);
        }
        System.out.println();
        for (int i=0; i<str_array.length; i++ ){
            for (int j=0, p=str_array[i].length()-1;  j<str_array[i].length()/2 & p>str_array[i].length()/2;   j++, p--) {
                if (str_array[i].charAt(j) == str_array[i].charAt(p) ) {

                    System.out.println(str_array[i]);
                }
                else {
                    System.out.println("oops");
                }
            }
        }
    }
}
