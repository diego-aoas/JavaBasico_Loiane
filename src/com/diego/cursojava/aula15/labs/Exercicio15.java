package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o lado do triângulo: ");
		double lado1 = scan.nextDouble();

		System.out.print("Digite outro lado do triângulo: ");
		double lado2 = scan.nextDouble();

		System.out.print("Digite um outro lado do triângulo: ");
		double lado3 = scan.nextDouble();

		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2
				&& (lado2 + lado3) > lado1) {

			System.out.println("É um triângulo!");
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Do tipo Equilátero!");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Do tipo Escaleno");
			} else {
				System.out.println("Do tipo Isósceles");
			}
		} else {
			System.out.println("Não é um triângulo!");
		}
	}
}
