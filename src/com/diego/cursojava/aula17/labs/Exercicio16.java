package com.diego.cursojava.aula17.labs;

public class Exercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 0, b = 0, c = 1;
		
		System.out.print(c + ", ");
		
		for (int i = 0; c < 500; i++) {
			a = b;
			b = c;
			c = b + a;
			System.out.print(c + ", ");
		}

	}

}
