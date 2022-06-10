package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = teclado.nextDouble();

        double celsius = (5 * (fahrenheit - 32) / 9);

        System.out.println("A temperatura em Celsius é: " + celsius);

    }
}
