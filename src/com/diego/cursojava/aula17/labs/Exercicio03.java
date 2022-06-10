package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		do {
			System.out.print("Digite seu nome (com mais de 3 caracteres): ");
			nome = input.next();
		} while (nome.length() <= 3);

		do {
			System.out.print("Digite sua idade (entre 0 e 150): ");
			idade = input.nextInt();
		} while (idade < 0 || idade > 150);

		do {
			System.out.print("Digite seu salário (Maior que 0): ");
			salario = input.nextInt();
		} while (salario <= 0);

		do {
			System.out.print("Digite seu sexo (F - Feminino ou M): ");
			sexo = input.next();
		} while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));

		do {
			System.out
					.print("Digite seu estado civil (S - Solteiro; C - Casado; V - Viúvo; D - Divorciado): ");
			estadoCivil = input.next();
		} while (!estadoCivil.equalsIgnoreCase("s")
				&& !estadoCivil.equalsIgnoreCase("c")
				&& !estadoCivil.equalsIgnoreCase("v")
				&& !estadoCivil.equalsIgnoreCase("d"));

		System.out.println("::: As seguintes informações foram coletadas :::");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
	}
}