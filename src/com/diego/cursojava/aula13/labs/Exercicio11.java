package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = teclado.nextInt();

        System.out.print("Digite um número real: ");
        double real = teclado.nextDouble();

        double calcA = (num1 * 2) * (num2 / 2);
        double calcB = (num1 * 3) + real;
        double calcC = Math.pow(real, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + calcA);

        System.out.println("Soma do triplo do primeiro com o terceiro é: " + calcB);

        System.out.println("O terceiro elevado ao cubo é: " + calcC);
    }

}
