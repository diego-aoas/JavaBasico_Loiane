package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double temp = 0, somaTemp = 0, tempMin = Double.MAX_VALUE, tempMax = Double.MIN_VALUE, medTemp = 0, cont = 0;
		String finalizar = "";

		do {
			System.out.print("Entre com a temperatura: ");
			temp = input.nextDouble();

			somaTemp += temp;

			if (temp > tempMax) {
				tempMax = temp;
			}

			if (temp < tempMin) {
				tempMin = temp;
			}

			cont++;
			System.out
					.print("Inserir mais temperaturas [N] - Não; [S] - Sim: ");
			finalizar = input.next();
		} while (!finalizar.equalsIgnoreCase("n"));

		medTemp = somaTemp / cont;

		System.out.println("A menor temperatura foi: " + tempMin
				+ "\nA maior temperatura foi: " + tempMax
				+ "\nA média de temperatura foi: " + medTemp);

	}
}
