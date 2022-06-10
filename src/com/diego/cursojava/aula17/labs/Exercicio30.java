package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Montar a tabuada de: ");
		int tabuada = input.nextInt();

		System.out.print("Começar por: ");
		int inicio = input.nextInt();

		System.out.print("Terminar em: ");
		int fim = input.nextInt();

		System.out.println("Vou montar a tabuada de " + tabuada
				+ " começando em " + inicio + " e terminando em " + fim + ":");

		for (int i = inicio; i <= fim; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}
	}
}
