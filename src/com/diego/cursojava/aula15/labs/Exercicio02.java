package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double num = scan.nextDouble();

		if (num >= 0) {
			System.out.println("O valor " + num + " é positivo.");
		} else {
			System.out.println("O valor " + num + " é negativo.");
		}

	}
}
