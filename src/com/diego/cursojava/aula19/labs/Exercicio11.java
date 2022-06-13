package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetA = new int[10];
		int par = 0;

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Entre com o valor de vetA[" + i + "]: ");
			vetA[i] = sc.nextInt();

			if (vetA[i] % 2 == 0) {
				par += 1;
			}

		}

		System.out.println("A quantidade de números pares digitados foram: " + par);

	}

}
