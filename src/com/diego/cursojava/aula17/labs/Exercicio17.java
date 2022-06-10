package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com o número a ser calculado o fatorial: ");
		int num = input.nextInt();

		int resultado = 1;

		for (int i = num; i > 0; i--) {
			resultado *= i;
		}
		
		System.out.println("O fatorial de " + num+ "! é: " + resultado);

	}

}
