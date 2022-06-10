package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out
				.print("::Tipos de carnes:: \n1 - File Duplo \n2 - Alcatra \n3 - Picanha \nDigite o número da carne desejada: ");
		int carne = scan.nextInt();

		System.out.print("Digite quantos kg deseja: ");
		double kgCarne = scan.nextDouble();

		double valorTotal = 0;

		switch (carne) {
		case 1:
			if (kgCarne <= 5) {
				valorTotal = kgCarne * 4.90;
			} else {
				valorTotal = kgCarne * 5.80;
			}
			break;
		case 2:
			if (kgCarne <= 5) {
				valorTotal = kgCarne * 5.90;
			} else {
				valorTotal = kgCarne * 6.80;
			}
			break;
		case 3:
			if (kgCarne <= 5) {
				valorTotal = kgCarne * 6.90;
			} else {
				valorTotal = kgCarne * 7.80;
			}
			break;
		default:
			break;
		}

		System.out.print("O valor total da compra foi de R$" + valorTotal
				+ " com cartão Tabajara fica no valor de R$: "
				+ (valorTotal - (valorTotal * 0.05)));

	}
}
