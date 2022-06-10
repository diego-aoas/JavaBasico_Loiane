package com.diego.cursojava.aula17.labs;

public class Exercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float paisA = 80000;
		float paisB = 200000;
		int i = 0;

		// do {
		for (; paisA <= paisB; i++) {
			// while (paisA <= paisB) {
			paisA *= 1.03;
			System.out.println("\nPais A: " + paisA + " " + i);
			paisB *= 1.015;
			System.out.println("Pais B: " + paisB + " " + i);
			// i++;
			// } while (paisA <= paisB);
		}

		System.out.println("\nO país A terá maior ou igual população que país B em "
				+ i + " anos.\n\n" + paisA + "\n" + paisB);
	}
}
