package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] vetA = new int[10];

		double totImpar = 0, totPar = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Entre com o valor de vetA[" + i + "]: ");
			vetA[i] = input.nextInt();

			if (vetA[i] % 2 == 0) {
				totPar += 1;
			} else {
				totImpar += 1;
			}

		}

		totPar = (totPar / 10) * 100;
		totImpar = (totImpar / 10) * 100;

		System.out.print("A porcentagem de vetores pares é de " + totPar + "% e a ímpares é de " + totImpar + "%");

	}

}
