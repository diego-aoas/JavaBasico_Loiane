package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a quantidade de KG de Morangos: ");
		double kgMorango = scan.nextDouble();

		System.out.print("Digite a quantidade de KG de Maçãs: ");
		double kgMaca = scan.nextDouble();

		double totalMorango = 0;
		double totalMaca = 0;
		double totalFruta = 0;

		double totalPeso = kgMorango + kgMaca;

		if (kgMorango <= 5) {
			totalMorango = kgMorango * 2.5;
		} else {
			totalMorango = kgMorango * 2.20;
		}

		if (kgMaca <= 5) {
			totalMaca = kgMaca * 1.80;
		} else {
			totalMaca = kgMaca * 1.50;
		}

		totalFruta = totalMaca + totalMorango;

		if (totalPeso >= 8 || totalFruta >= 25) {
			totalFruta = totalFruta - (totalFruta * 0.1);
			System.out.print("O valor a ser pago é R$: " + totalFruta);
		} else {
			System.out.print("O valor a ser pago é R$: " + totalFruta);
		}
	}
}
