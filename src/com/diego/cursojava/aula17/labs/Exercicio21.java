package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int turma, alunos, media, somaAlunos = 0, i = 0;

		System.out.print("Digite a quantidade de turmas: ");
		turma = input.nextInt();

		while (i < turma) {
			System.out.print("Entre com a quantidade de alunos: ");
			alunos = input.nextInt();

			if (alunos <= 40) {
				somaAlunos += alunos;
				i++;
			} else {
				System.out
						.print("Inválido!!! A quantidade de alunos não pode ser maior que 40.\n");
			}
		}

		media = somaAlunos / turma;

		System.out.print("A média das " + turma + " turmas é de " + media
				+ " alunos.");
	}
}
