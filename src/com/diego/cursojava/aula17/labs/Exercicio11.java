package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, soma = 0;

		System.out.print("Entre com um número: ");
		num1 = input.nextInt();

		System.out.print("Entre com outro número: ");
		num2 = input.nextInt();

		for (int cont = num1; cont <= num2; cont++) {
			soma += cont;
		}
		System.out.println("A soma dos números entre " + num1 + " e " + num2
				+ " é: " + soma);

	}
}
