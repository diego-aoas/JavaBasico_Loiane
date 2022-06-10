package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com o número a ser calculado o fatorial: ");
		int num = input.nextInt();

		int resultado = 1;

		System.out.print(num + "! = ");
		for (int i = num; i > 0; i--) {
			System.out.print(i + " . ");
			resultado *= i;
		}

		// System.out.println("Fatorial de: " + num);
		System.out.println("= " + resultado);

	}
}
