package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int[] vetC = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Entre com o valor de vetA[" + i + "]: ");
			vetA[i] = sc.nextInt();
			System.out.print("Entre com o valor de vetB[" + i + "]: ");
			vetB[i] = sc.nextInt();
			vetC[i] = vetA[i] * vetB[i];
		}
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("=====================================");
			System.out.println("O valor de vetA[" + i + "] é: " + vetA[i]);
			System.out.println("O valor de vetB[" + i + "] é: " + vetB[i]);
			System.out.println("O valor de vetC[" + i + "] é: " + vetC[i]);
		}
	}

}
