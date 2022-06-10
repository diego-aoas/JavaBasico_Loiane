package com.diego.cursojava.aula13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A conversão de Celsius para Fahrenheit é:" + fahrenheit);

    }
}
