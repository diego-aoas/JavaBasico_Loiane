package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Insira o valor de A: ");
		int a = scan.nextInt();

		if (a == 0) {
			System.out.println("O valor de A não pode ser 0...");
		} else {
			System.out.print("Insira o valor de B: ");
			int b = scan.nextInt();

			System.out.print("Insira o valor de C: ");
			int c = scan.nextInt();

			double delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0) {
				System.out.println("A equação não possui raízes reais");
			} else if (delta == 0) {
				System.out.println("A equação possui apenas uma raiz real");
			} else {

				double x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
				double x2 = ((-b) - Math.sqrt(delta)) / 2 * a;

				System.out.println("A raiz de x1 é: " + x1);
				System.out.println("A raiz de x2 é: " + x2);

			}

		}
	}
}
