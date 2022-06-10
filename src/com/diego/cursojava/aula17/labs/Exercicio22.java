package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com a quantidade de CDs: ");
		int qtdCd = input.nextInt();
		double valCd, total = 0, media = 0;

		for (int i = 0; i < qtdCd; i++) {
			System.out.print("Insira o valor do CD: ");
			valCd = input.nextDouble();

			total += valCd;
		}
		media = total / qtdCd;
		System.out.print("O valor investido em CDs é de R$: " + total
				+ " a média dos " + qtdCd + " é de R$: " + media + " cada CD.");

	}
}
