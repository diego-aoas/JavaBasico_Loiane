package com.diego.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {
    private static double salario;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu salário R$: ");
        salario = scan.nextDouble();

        if (salario < 280) {
            System.out.println(
                    "Seu salário de R$ " + salario + " teve um aumento de 20%: R$ " + (salario *0.20) +  ", totalizando: R$ " + (salario * 1.2));
        } else if (salario >= 280 && salario < 700) {
            System.out.println(
                    "Seu salário de R$ " + salario + " teve um aumento de 15%: R$ " + (salario * 0.15) +  ", totalizando: R$ " + (salario * 1.15));
        } else if (salario >= 700 && salario < 1500) {
            System.out.println(
                    "Seu salário de R$ " + salario + " teve um aumento de 10%: R$ " + (salario * 0.1) +  ", totalizando: R$ " + (salario * 1.10));
        } else {
            System.out.println(
                    "Seu salário de R$ " + salario + " teve um aumento de 5%: R$ " + (salario *0.05)+ ", totalizando: R$ " + (salario * 1.05));
        }
    }
}
