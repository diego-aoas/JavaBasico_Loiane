package com.diego.cursojava.aula13;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite quanto ganha por hora: ");
        double salario = teclado.nextDouble();

        System.out.print("Digite quantas horas trabalha por mês: ");
        double horas = teclado.nextDouble();

        double calculo = salario * horas;

        System.out.println("O total do salário é de: " + calculo);

    }
}
