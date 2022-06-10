package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();

		System.out.print("Digite o preço do segundo produto: ");
		double produto2 = scan.nextDouble();

		System.out.print("Digite o preço do terceiro produto: ");
		double produto3 = scan.nextDouble();

		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("O produto 1 é o mais barato, compre-o. R$ " + produto1);
		} else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O produto 2 é o mais barato, compre-o. R$ " + produto2);

		} else {
			System.out.println("O produto 3 é o mais barato, compre-o. R$ " + produto3);
		}
	}
}
