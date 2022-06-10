package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double num1 = scan.nextDouble();

		System.out.print("Digite outro número: ");
		double num2 = scan.nextDouble();

		System.out.print("Digite mais um outro número: ");
		double num3 = scan.nextDouble();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O maior número digitado foi o primeiro: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O maior número digitado foi o segundo: " + num2);
		} else {
			System.out.println("O maior número digitado foi o terceiro: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.print("O menor número digitado foi o primeiro: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.print("O menor número digitado foi o segundo: " + num2);
		} else {
			System.out.print("O menor número digitado foi o terceiro: " + num3);
		}
		
		
	}
}
