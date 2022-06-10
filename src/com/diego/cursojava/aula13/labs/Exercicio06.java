package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raioCirculo = scan.nextDouble();

        double area = Math.PI * Math.pow(raioCirculo, 2);
        System.out.println("A área do circulo é: " + area);

    }
}
