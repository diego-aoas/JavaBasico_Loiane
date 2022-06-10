package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o seu valor/hora R$: ");
		double valor = scan.nextDouble();

		System.out.print("Digite o total de horas trabalhada no mês: ");
		double horas = scan.nextDouble();

		double salario = valor * horas;

		// double sindicato = salario * 0.03;
		double fgts = salario * 0.11;
		double inss = salario * 0.10;
		double ir;
		double desconto;

		if (salario <= 900) {
			ir = 0;
			desconto = ir + inss;
			// System.out.println("Salário Bruto " + (valor) + " x " + horas
			// + ": R$ " + salario);
			// System.out.println("(-) IR (0%)    : R$ " + "isento");
			// System.out.println("(-) INSS (10%) : R$ " + inss);
			// System.out.println("FGTS (11%)     : R$ " + fgts);
			// System.out.println("Total Descontos: R$ " + desconto);
			// System.out.println("Salario Liquido: R$ " + (salario -
			// desconto));

		} else if (salario > 900 && salario <= 1500) {
			ir = salario * 0.05;
			desconto = ir + inss;
			// System.out.println("Salário Bruto (" + (valor) + " x " + horas
			// + "): R$ " + salario);
			// System.out.println("(-) IR (5%)    : R$ " + ir);
			// System.out.println("(-) INSS (10%) : R$ " + inss);
			// System.out.println("FGTS (11%)     : R$ " + fgts);
			// System.out.println("Total Descontos: R$ " + desconto);
			// System.out.println("Salario Liquido: R$ " + (salario -
			// desconto));

		} else if (salario > 1500 && salario <= 2500) {
			ir = salario * 0.1;
			desconto = ir + inss;
			// System.out.println("Salário Bruto (" + (valor) + " x " + horas
			// + "): R$ " + salario);
			// System.out.println("(-) IR (10%)    : R$ " + ir);
			// System.out.println("(-) INSS (10%) : R$ " + inss);
			// System.out.println("FGTS (11%)     : R$ " + fgts);
			// System.out.println("Total Descontos: R$ " + desconto);
			// System.out.println("Salario Liquido: R$ " + (salario -
			// desconto));
		} else {
			ir = salario * 0.2;
			desconto = ir + inss;
			// System.out.println("Salário Bruto (" + (valor) + " x " + horas
			// + "): R$ " + salario);
			// System.out.println("(-) IR (20%)    : R$ " + ir);
			// System.out.println("(-) INSS (10%) : R$ " + inss);
			// System.out.println("FGTS (11%)     : R$ " + fgts);
			// System.out.println("Total Descontos: R$ " + desconto);
			// System.out.println("Salario Liquido: R$ " + (salario -
			// desconto));
		}

		 System.out.println("Salário Bruto (" + (valor) + " x " + horas
		 + "): R$ " + salario);
		 System.out.println("(-) IR (" + 20 +"%)    : R$ " + ir);
		 System.out.println("(-) INSS (10%) : R$ " + inss);
		 System.out.println("FGTS (11%)     : R$ " + fgts);
		 System.out.println("Total Descontos: R$ " + desconto);
		 System.out.println("Salario Liquido: R$ " + (salario -
		 desconto));

	}
}
