package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out
				.print("Entre com quantas posições quer a sequência de Fibonacci: ");
		int pos = input.nextInt();

		int a = 0, b = 0, c = 1;

		for (int i = 0; i < pos; i++) {
			System.out.print(c + ", ");
			a = b;
			b = c;
			c = b + a;
		}
	}
}
