package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entre com uma nota de 0 a 10: ");
		int num = input.nextInt();

		while (num < 0 || num > 10) {
			System.out.print("Valor inválido. Digite novamente: ");
			num = input.nextInt();
		}
		System.out.println("O valor digitado é válido: " + num);
	}
}
