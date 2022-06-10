package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Quantidade de pessoas: ");
		int qtdPessoas = input.nextInt();

		int idade, somaIdade = 0, media = 0;

		for (int i = 0; i < qtdPessoas; i++) {

			System.out.print("Insira a idade: ");
			idade = input.nextInt();

			somaIdade += idade;
		}

		media = somaIdade / qtdPessoas;

		if (media > 0 && media <= 25) {
			System.out.print("A média de " + media
					+ " anos é considerada jovem.");
		} else if (media >= 26 && media <= 60) {
			System.out.print("A média de " + media
					+ " anos é considerada adulta.");
		} else {
			System.out.print("A média de " + media
					+ " anos é considerada idosa.");
		}

	}
}
