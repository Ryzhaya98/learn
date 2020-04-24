package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    String str = "Валя любит кашу кушать только гречневую вот так что еще сказать я хзхз Валя такая валя";
	    System.out.println(str);
	    String [] str_array = str.split(" ");
	    String slovo;
	    System.out.println("Enter slovo");
	    slovo = sc.nextLine();
	    int count=0;
	    for (int i=0; i<str_array.length; i++){

			if ( str_array[i].equals(slovo) == true){
				count++;
			}

				}
		System.out.println("Слово" + slovo + " встречается в тексте " + count + "раза");
			}

		}

