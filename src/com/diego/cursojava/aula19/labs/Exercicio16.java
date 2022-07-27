package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		double inf15 = 0, ig15 = 0, sup15 = 0, mediaSup15 = 0;

		Scanner input = new Scanner(System.in);

		int[] vetA = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o valor de vetA[" + i + "]: ");
			vetA[i] = input.nextInt();

			if (vetA[i] < 15) {
				inf15 += 1;
			} else if (vetA[i] == 15) {
				ig15 += 1;
			} else {
				mediaSup15 += vetA[i];
				sup15 += 1;
			}
		}

		mediaSup15 = mediaSup15 / sup15;

		System.out.println("O número de vetores menores que 15 foram: " + inf15);
		System.out.println("O número de vetores menores que 15 foram: " + ig15);
		System.out.println("O número de vetores menores que 15 foram: " + sup15 + " e a média foi: " + mediaSup15);

	}

}
