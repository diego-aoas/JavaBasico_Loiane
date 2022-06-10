package com.diego.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira nota 1: ");
        double nota1 = scan.nextDouble();

        System.out.print("Insira nota 2: ");
        double nota2 = scan.nextDouble();

        System.out.print("Insira nota 3: ");
        double nota3 = scan.nextDouble();

        System.out.print("Insira nota 4: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média bimestral de 4 notas é: " + media);

    }
}
