package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetA = new int[8];
        int[] vetB = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Digite um número para o vetor " + i + ": ");
            vetA[i] = input.nextInt();

            vetB[i] = vetA[i] * 2;
        }

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("=====================================");
            System.out.println("O valor de vetA[" + i + "] é: " + vetA[i]);
            System.out.println("O valor de vetB[" + i + "] é: " + vetB[i]);
        }

    }

}
