package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		int ano = scan.nextInt();

		if (ano % 4 == 0) { // ok
			if (ano % 100 == 0) {
				if (ano % 400 == 0) {
					System.out.println("O ano de " + ano + " é bissexto");
				} else {
					System.out.println("O ano de " + ano + " não é bissexto");
				}
			} else {
				System.out.println("O ano de " + ano + " é bissexto");
			}
		} else {
			System.out.println("O ano de " + ano + " não é bissexto");

		}
	}
}
