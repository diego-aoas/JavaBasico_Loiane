package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do arquivo em MB: ");
		double tamanhoArquivo = teclado.nextDouble();
		
		System.out.print("Digite a velocidade da internet em Mbps: ");
		double velocidadeInternet = teclado.nextDouble();
		
		double tempoDownload = tamanhoArquivo / velocidadeInternet;
		
		System.out.print("O tempo aproximado de download é: " + tempoDownload + " minutos.");
		
	}
}
