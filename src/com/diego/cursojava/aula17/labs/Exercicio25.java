package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double valorProd = 0, pagto = 0, total = 0, troco = 0;
		int i = 1;

		System.out.println("::: Lojas Tabajara :::");
		do {
			System.out.print("Produto " + i + ": ");
			valorProd = input.nextDouble();
			total += valorProd;
			i++;
		} while (valorProd != 0);

		// for (int i = 1; valorProd != 0; i++) {

		// }
		System.out.println("Total: R$ " + total);
		System.out.print("Dinheiro: R$ ");
		pagto = input.nextDouble();
		
		troco = pagto - total;
		System.out.println("Troco: R$ " + troco);
		

	}
}
