package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Insira o número de termos: ");
		int termos = input.nextInt();

		double soma = 0;

		for (int i = 1; i <= termos; i++) {

			System.out.print(1 + "/" + i + " + ");
			soma += 1 / (double)i;
		}

		System.out.println("\nSoma é: " + soma);
		
	}
}
