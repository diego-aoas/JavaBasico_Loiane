package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com o número de base: ");
		int base = input.nextInt();

		System.out.print("Entre com o número de expoente: ");
		int exp = input.nextInt();

		int resultado = 1;

		for (int i = 0; i < exp; i++) {
			resultado *= base;
		}

		System.out.println("O resultado é: " + resultado);

	}
}
