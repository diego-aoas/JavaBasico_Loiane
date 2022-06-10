package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com o número a ser calculado a tabuada: ");
		int num = input.nextInt();

		System.out.println("::: Tabuada do " + num + " :::");

		for (int i = 1; i <= 10; i++) {
			int resultado = num * i;
			System.out.println(num + " x " + i + " = " + resultado);
		}

	}

}
