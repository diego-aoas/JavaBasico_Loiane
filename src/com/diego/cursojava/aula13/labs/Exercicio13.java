package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Quanto ganha por hora: ");
		double ganhoHora = teclado.nextDouble();
		
		System.out.print("Quantas horas trabalhadas por mês: ");
		double horasTrabalhadasMes = teclado.nextDouble();
		
		double salarioBruto = ganhoHora * horasTrabalhadasMes;
		
		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		
		System.out.println("Salário Bruto: R$ " + salarioBruto + "\nIR (11%): R$ " + ir + "\nINSS (8%): R$ " + inss  + "\nSindicato (5%): R$ " + sindicato + "\nDescontos: R$ " + (ir + inss + sindicato) + "\nSalário Liquido: R$ " + (salarioBruto - ir - inss - sindicato));
		

	}
}
