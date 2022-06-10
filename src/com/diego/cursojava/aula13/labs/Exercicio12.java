package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com sua altura: ");
		double altura = teclado.nextDouble();

		double calculo = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + calculo);

	}
}
