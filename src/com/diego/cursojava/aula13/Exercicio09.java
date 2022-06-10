package com.diego.cursojava.aula13;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = teclado.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + celsius);

    }
}
