package com.diego.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DecimalFormat format = new DecimalFormat("###,###.##");

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o salário: ");
		int salario = input.nextInt();

		System.out.print("Digite o ano: ");
		int ano = input.nextInt();

		int difAnos = ano - 1995;
		double taxa = 0.015, novoSalario = salario;

		for (int i = 0; i < difAnos; i++) {
			novoSalario += novoSalario * taxa;
			taxa = 2 * taxa;
		}

		System.out.print("O salário atual é: " + format.format(novoSalario));
	}
}
