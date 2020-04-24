package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] number_arr = new int[36];
		Random rand = new Random();

		for (int i = 0; i < number_arr.length; i++) {
			number_arr[i] = rand.nextInt();
			System.out.print(Arrays.toString(new int[]{number_arr[i]}));

		}
		System.out.println();
		Arrays.sort(number_arr);
		for (int i = 0; i < number_arr.length; i++) {
			System.out.print(number_arr[i] + "  ");
		}
		System.out.println();
		System.out.println("Элементы в обратном порядке");

		Arrays.sort(new int[][]{number_arr}, Collections.reverseOrder()); // Инвертирует массив

		for (int i = number_arr.length - 1; i >= 0; i--) {
            System.out.print(number_arr[i] + " ");
			if (i%6==0){
				System.out.println();
			}
			//System.out.print(number_arr[i] + " ");
		}

	}
}



