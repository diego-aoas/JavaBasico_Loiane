package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com um número: ");
		int num = input.nextInt();

		int numAux = 1, cont = 0;

		System.out.println("Os números primos de 1 a " + num + " : ");
		while (numAux <= num) {
			for (int i = 1; i <= numAux; i++) {
				if (numAux % i == 0) {
					cont++;
				}
			}
			if (cont == 2) {
				System.out.println(numAux);
			}
			cont = 0;
			numAux++;
		}
	}
}
