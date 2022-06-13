package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		int[] vetA = new int[15];
		int[] vetB = new int[vetA.length];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Entre com o valor do vetor [" + i + "]: ");
			vetA[i] = input.nextInt();

			vetB[i] = vetA[i] * vetA[i];
		}

		for (int i = 0; i < vetA.length; i++) {
			System.out.println("=====================================");
			System.out.println("O valor de vetA[" + i + "] é: " + vetA[i]);
			System.out.println("O valor de vetB[" + i + "] é: " + vetB[i]);
		}

	}

}
