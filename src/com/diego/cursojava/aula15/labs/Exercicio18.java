package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("É um número par!!!");
		} else {
			System.out.println("É um número ímpar!!!");
		}

	}
}
