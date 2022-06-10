package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a quantidade de litros vendidos: ");
		double litros = scan.nextDouble();

		System.out
				.print("Digite o tipo de combustível.\nA - Álcool, G- Gasolina: ");
		String tipo = scan.next();

		double gasolina = 2.50;
		double alcool = 1.90;
		double total = 0;

		if (tipo.equalsIgnoreCase("a")) {
			total = litros * alcool;

			if (litros <= 20) {
				total = total - (total * 0.03);
				System.out.print("O valor do abastecimento de álcool foi de R$"
						+ total);
			} else {
				total = total - (total * 0.05);
				System.out.print("O valor do abastecimento de álcool foi de R$"
						+ total);
			}
		} else {

			total = litros * gasolina;

			if (litros <= 20) {
				total = total - (total * 0.04);
				System.out
						.print("O valor do abastecimento de gasolina foi de R$"
								+ total);
			} else {
				total = total - (total * 0.06);
				System.out
						.print("O valor do abastecimento de gasolina foi de R$"
								+ total);
			}
		}
	}
}
