package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número correspondente da semana: ");
		int diaSemana = scan.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.print("1 - Domingo");
			break;
		case 2:
			System.out.print("2 - Segunda-feira");
			break;
		case 3:
			System.out.print("3 - Terça-feira");
			break;
		case 4:
			System.out.print("4 - Quarta-feira");
			break;
		case 5:
			System.out.print("5 - Quinta-feira");
			break;
		case 6:
			System.out.print("6 - Sexta-feira");
			break;
		case 7:
			System.out.print("7 - Sábado");
			break;
		default:
			System.out.print("Valor inválido");
			break;
		}

	}
}
