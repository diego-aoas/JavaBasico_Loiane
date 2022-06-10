package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cont;
		double num, resultado = 0;
		// do{
		for (cont = 0; cont < 5; cont++) {
			System.out.print("Informe um número: ");
			num = input.nextDouble();
			resultado += num;
			// cont++;
		}
		// } while (cont <= 5);

		System.out.print("A média foi " + resultado / 5);
	}
}
