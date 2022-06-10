package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int divNum = 0;

		System.out.print("Entre com um número: ");
		double num = input.nextDouble();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divNum++;
			}
		}

		if (divNum == 2) {
			System.out.print(num + " é número primo.");
		} else {
			System.out.print(num + " não é número primo.");
		}
	}
}
