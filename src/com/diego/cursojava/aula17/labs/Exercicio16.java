package com.diego.cursojava.aula17.labs;

public class Exercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 0, b = 0, c = 1;
		
		System.out.print(c + ", ");
		
		for (; c < 500;) {
			a = b;
			b = c;
			c = b + a;
			System.out.print(c + ", ");
		}

	}

}
