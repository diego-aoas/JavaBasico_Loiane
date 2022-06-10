package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de metros para converter em cm: ");
        double metros = scan.nextDouble();

        double conversao = metros * 100;

        System.out.println("A quantidade de " + metros + " metros em centimetros é: " + conversao);

    }
}
