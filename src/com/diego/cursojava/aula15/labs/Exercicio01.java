package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double num1 = scan.nextDouble();

		System.out.print("Digite outro número: ");
		double num2 = scan.nextDouble();

		if (num1 > num2) {
			System.out.println("O maior número é o primeiro digitado: " + num1);
		} else {
			System.out.println("O número maior é o segundo digitado: " + num2);
		}

	}
}
