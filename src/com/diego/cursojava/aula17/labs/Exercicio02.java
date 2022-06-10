package com.diego.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite se usuario: ");
		String usuario = input.next();

		System.out.print("Digite sua senha: ");
		String senha = input.next();

		while (usuario.equalsIgnoreCase(senha)) {
			System.out.println("Usuário e senha não pode ser iguais");
			System.out.print("Digite novamento o usuario: ");
			usuario = input.next();

			System.out.print("Digite novamente sua senha: ");
			senha = input.next();
		}

		System.out.println("Tudo certo com seu usuário e senha.");

	}
}
