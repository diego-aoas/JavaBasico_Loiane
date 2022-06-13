package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetA = new int[10];
		int soma = 0;
		int impar = 0;
		double media = 0;

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Entre com o valor de vetA[" + i + "]: ");
			vetA[i] = sc.nextInt();
			soma += vetA[i];

			if (vetA[i] % 2 != 0) {
				impar += 1;
			}
		}

		media = soma / impar;

		System.out.println("A média aritmética simples dos números impares é: " + media);

	}

}
