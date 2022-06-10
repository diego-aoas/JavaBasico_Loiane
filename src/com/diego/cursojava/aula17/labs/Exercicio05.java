package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double paisA, paisB;
		double indiceA, indiceB;
		// int ano;
		int ano = 0;

		do {
			System.out
					.println("### País A não pode ter população maior que País B ###");
			System.out.print("Insira a população do país A: ");
			paisA = input.nextDouble();

			System.out.print("Insira a taxa de crescimento (em %) do país A: ");
			indiceA = input.nextDouble();

			System.out.print("Insira a população do país B: ");
			paisB = input.nextDouble();

			System.out.print("Insira a taxa de crescimento (em %) do país B: ");
			indiceB = input.nextDouble();
		} while (paisA > paisB);

		for (ano = 0; paisA <= paisB; ano++) {
			paisA += (paisA * indiceA) / 100;
			paisB += (paisB * indiceB) / 100;
		}

//		while (paisA <= paisB) {
//			paisA += (paisA * indiceA) / 100;
//			paisB += (paisB * indiceB) / 100;
//			ano++;
//		}

		System.out
				.println("\nO país A terá maior ou igual população que país B em "
						+ ano + " anos.\n\n" + paisA + "\n" + paisB);
	}
}
