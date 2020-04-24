package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "valya kak dela kogda ghjdpj ";
	String[] str_arra = str.split(" ");

	    for (int i=0; i< str_arra.length; i++) {
            System.out.println(str_arra[i]);
        }
	    System.out.println();
	    for (int i=0; i< str_arra.length; i++) {
	    	for (int j=0; j< str_arra[i].length(); j++){
				if (str_arra[i].charAt(j) == 'k'){
					System.out.println(str_arra[i]);
					break;
				}
			}
        }
    }
}
