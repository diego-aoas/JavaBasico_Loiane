package com.diego.cursojava.aula19.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor do vetor " + i + ": ");
            vetorA[i] = input.nextInt();

            vetorB[i] = vetorA[i];

        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("=====================================");
            System.out.println("O Valor de vetorA[" + i + "] é: " + vetorA[i]);
            System.out.println("O Valor de vetorB[" + i + "] é: " + vetorB[i]);
        }
    }
}
