package com.diego.cursojava.aula13;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double ladoQuadrado = scan.nextDouble();

        double area = Math.pow(ladoQuadrado, 2);

        System.out.println("A área do quadrado é " + area);

    }
}
