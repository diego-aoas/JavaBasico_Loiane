package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int baixo = 0;
		double soma = 0.0;

		System.out.print("Informe o número de termos: ");
		int termos = input.nextInt();

		for (int i = 1; i <= termos; i++) {
			baixo = i + (i - 1);
			soma += i / (double) baixo;
			System.out.print(i + "/" + baixo + " + ");

		}
		System.out.println("\nSoma é: " + soma);

	}

}
