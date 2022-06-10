package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int par = 0, impar = 0, num;

		for (int i = 0; i < 10; i++) {
			System.out.print("Entre com um número: ");
			num = input.nextInt();

			if (num % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}

		System.out.print("A quantidade de números pares digitados são: " + par
				+ " e impares são: " + impar);

	}

}
