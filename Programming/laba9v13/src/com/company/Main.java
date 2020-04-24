package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "qwertgdkpspnqnsvnonqnnoqnnonqnl";
        StringBuilder str_b = new StringBuilder(str);
	//str.toCharArray();
        for (int i=0; i<str_b.length(); i++) {
            if (str_b.charAt(i) == 'q'){
                str_b.insert(i+1, 'u');
            }
        }
        System.out.print(str_b);
    }
}
