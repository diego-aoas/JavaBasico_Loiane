package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com um número inteiro: ");
		int num = input.nextInt();

		int cont = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}

		if (cont == 2) {
			System.out.print("O número " + num + " é primo!");
		} else {
			System.out.print("O número " + num + " não é primo...");
		}
	}
}
