package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Insira o valor do pão: ");
		double preco = input.nextDouble();

		System.out.println("Preço do pão: R$ " + preco);
		System.out
				.println("::: Panificadora Pão de Ontem - Tabela de Preços :::");

		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + preco * i);
		}

	}
}
