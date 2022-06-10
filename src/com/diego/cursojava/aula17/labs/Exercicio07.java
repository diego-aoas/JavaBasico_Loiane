package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 0, cont = 0, aux = Integer.MIN_VALUE;

		do {
			System.out.print("Informe um número: ");
			num = input.nextInt();
			if (num > aux) {
				aux = num;
			}
			cont++;
		} while (cont < 5);

		System.out.print("O maior número digitado foi o " + aux);

	}
}
