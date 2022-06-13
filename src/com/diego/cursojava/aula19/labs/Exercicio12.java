package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetA = new int[10];
		int soma = 0;

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Entre com o valor de vetA[" + i + "]: ");
			vetA[i] = sc.nextInt();

			soma += vetA[i];
		}

		System.out.println("A quantidade de números pares digitados foram: " + soma);

	}
}
