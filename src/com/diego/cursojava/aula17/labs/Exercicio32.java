package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Especificação   - Código -  Preço");
		System.out.println("Cachorro Quente -  100  -  R$ 1,20");
		System.out.println("Bauru Simpes    -  101  -  R$ 1,30");
		System.out.println("Bauru com Ovos  -  102  -  R$ 1,50");
		System.out.println("Hamburguer      -  103  -  R$ 1,20");
		System.out.println("Cheeseburguer   -  104  -  R$ 1,30");
		System.out.println("Refrigerante    -  105  -  R$ 1,00");

		int pedido, qtd;
		double total = 0;
		String finalizar = "";

		do {
			System.out.print("\nEntre com código do item: ");
			pedido = input.nextInt();

			System.out.print("Entre com a quantidade: ");
			qtd = input.nextInt();

			if (pedido == 100) {
				System.out.println("Cachorro quente -> 1,20 X " + qtd + " = R$ "
						+ (1.2 * qtd));
				total += 1.20 * qtd;

			} else if (pedido == 101) {
				System.out.println("Bauru simples -> 1,30 X " + qtd + " = R$ "
						+ (1.3 * qtd));
				total += 1.30 * qtd;

			} else if (pedido == 102) {
				System.out.println("Bauru com ovo -> 1,50 X " + qtd + " = R$ "
						+ (1.5 * qtd));
				total += 1.50 * qtd;

			} else if (pedido == 103) {
				System.out.println("Hamburguer -> 1,20 X " + qtd + " = R$ "
						+ (1.2 * qtd));
				total += 1.20 * qtd;

			} else if (pedido == 104) {
				System.out.println("Cheeseburguer -> 1,30 X " + qtd + " = R$ "
						+ (1.3 * qtd));
				total += 1.30 * qtd;

			} else if (pedido == 105) {
				System.out.println("Refrigerante -> 1,00 X " + qtd + " = R$ "
						+ (1.0 * qtd));
				total += 1.00 * qtd;
			} else {
				System.out.println("Opção inválida.");
			}

			System.out.print("Finalizar pedido [N]- Não [S]- Sim: ");
			finalizar = input.next();
		} while (finalizar.equalsIgnoreCase("n"));

		System.out.println("O valor total do pedido R$ " + total);

	}
}
