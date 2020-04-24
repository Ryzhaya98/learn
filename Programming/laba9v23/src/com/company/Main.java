package com.company;

public class Main {

    public static void main(String[] args) {
		String str = "*glffkmf****gh*";
		String str1 = str.replace("*", "");
		StringBuilder str_b = new StringBuilder(str1);

		for (int i=0; i<str_b.length(); i++) {
				str_b.insert(i+1, str_b.charAt(i));
			System.out.println(str_b);
		}
		//System.out.print(str_b);
    }
}
