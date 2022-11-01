package Aula04;

import java.util.Scanner;

public class ExercicioJava2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaraçao do vetor
        int[] vetor = new int[10];
       int  indicePar = 0, indiceImpar =0;

        // declaracao de variavel
        int soma = 0;

        // entrada de dados -> vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o  " + (i +1) + "número:");
            vetor[i] = in.nextInt();
            if ( vetor[i] % 2 == 0 ) {
                indicePar ++;
                soma += vetor[i];
            } else   {
                indiceImpar ++;
            }
        }
        System.out.println("A soma de numeros pares é " + soma);
    }
    }

