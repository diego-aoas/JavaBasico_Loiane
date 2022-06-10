package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int qtd = 0;
		double nota = 0, somaNota = 0, media = 0;
		String continuar = "";

		do {
			System.out.print("Insira a nota: ");
			nota = input.nextDouble();
			somaNota += nota;

			qtd++;

			System.out.print("Inserir mais notas [S] - Sim ou [N] - Não: ");
			continuar = input.next();
		} while (!continuar.equalsIgnoreCase("n"));

		media = somaNota / qtd;
		
		System.out.println("A média de " + qtd + " notas foi: " + media);

		System.out.println();
	}
}
