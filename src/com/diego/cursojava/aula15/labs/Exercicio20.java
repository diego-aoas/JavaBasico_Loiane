package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cont = 0;

		System.out.println("Responda as perguntas com true ou false: ");

		System.out.print("Telefonou para a vitima? R: ");
		boolean resp1 = scan.nextBoolean();

		System.out.print("Esteve no local do crime? R: ");
		boolean resp2 = scan.nextBoolean();

		System.out.print("Mora perto da vitima? R: ");
		boolean resp3 = scan.nextBoolean();

		System.out.print("Devia para a vitima? R: ");
		boolean resp4 = scan.nextBoolean();

		System.out.print("Ja trabalhou com a vitima" +
				"? R:  ");
		boolean resp5 = scan.nextBoolean();

		if (resp1 == true) {
			cont++;
		}

		if (resp2 == true) {
			cont++;
		}

		if (resp3 == true) {
			cont++;
		}

		if (resp4 == true) {
			cont++;
		}

		if (resp5 == true) {
			cont++;
		}

		if (cont == 2) {
			System.out.print("Você foi clasificado como suspeita...");
		} else if (cont == 3 || cont == 4) {
			System.out.print("Você foi clasificado como cúmplice...");
		} else if (cont == 5) {
			System.out.print("Você foi clasificado como assasino...");
		} else {
			System.out.print("Você é inocente!!!");
		}

	}
}
