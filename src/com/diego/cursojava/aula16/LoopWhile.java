package com.diego.cursojava.aula16;

public class LoopWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 0; // count ou cont
		int max = 10;

		System.out.println("Contando até " + max);

		while (i <= max) {
			System.out.println("Valor de i é " + i);
			i++; // i = i + 1; i += 1;
		}
		System.out.println(i);

		do {
			i++;
			System.out.println("Valor de i é " + i);
		} while (i < 13);
		System.out.println(i);
	}
}
