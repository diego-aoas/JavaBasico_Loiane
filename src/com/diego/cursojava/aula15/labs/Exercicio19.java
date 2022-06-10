package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double num1 = scan.nextDouble();

		System.out.print("Digite outro número: ");
		double num2 = scan.nextDouble();

		System.out
				.print("Digite 1 para soma +.\nDigite 2 para subtrair -.\nDigite 3 para multiplicacao x.\nDigite 4 para divisao /.\nDigite a operação desejada: ");
		int opcao = scan.nextInt();

		double resultado = 0;
		boolean valida = true;

		switch (opcao) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Não é opção válida.");
			valida = false;
		}

		if (valida == true) {
			System.out.println("O resultador é: " + resultado);
			if (resultado % 2 == 0) {
				System.out.println("O número é par.");
			} else {
				System.out.println("O número é impar.");
			}

			if (resultado >= 0) {
				System.out.println("O número é positivo.");
			} else {
				System.out.println("O número é negativo.");
			}
		}

	}
}
