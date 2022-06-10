package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetA = new int[15];
        int[] vetB = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Entre com o valor do vetor [" + i + "]: ");
            vetA[i] = input.nextInt();
            vetB[i] = (int) Math.sqrt(vetA[i]);
        }

        for (int i = 0; i < vetA.length; i++) {

            System.out.println("=====================================");
            System.out.println("O valor de vetA[" + i + "] é: " + vetA[i]);
            System.out.println("O valor de vetB[" + i + "] é: " + vetB[i]);
        }

    }
}
