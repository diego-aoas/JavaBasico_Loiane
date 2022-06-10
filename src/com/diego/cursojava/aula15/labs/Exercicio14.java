package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		System.out.println("Notas   : " + nota1 + " e " + nota2);
		System.out.println("Média   : " + media);

		if (media <= 4) {
			// System.out.println("Notas   : " + nota1 + " e " + nota2);
			// System.out.println("Média   : " + media);
			System.out.println("Conceito: " + "E");
			System.out.println("REPROVADO!!!");

		} else if (media > 4 && media <= 6) {
			// System.out.println("Notas   : " + nota1 + " e " + nota2);
			// System.out.println("Média   : " + media);
			System.out.println("Conceito: " + "D");
			System.out.println("REPROVADO!!!");
		} else if (media > 6 && media <= 7.5) {
			// System.out.println("Notas   : " + nota1 + " e " + nota2);
			// System.out.println("Média   : " + media);
			System.out.println("Conceito: " + "C");
			System.out.println("APROVADO!!!");
		} else if (media > 7.5 && media <= 9.0) {
			// System.out.println("Notas   : " + nota1 + " e " + nota2);
			// System.out.println("Média   : " + media);
			System.out.println("Conceito: " + "B");
			System.out.println("APROVADO!!!");
		} else {
			// System.out.println("Notas   : " + nota1 + " e " + nota2);
			// System.out.println("Média   : " + media);
			System.out.println("Conceito: " + "A");
			System.out.println("APROVADO!!!");
		}
	}
}
