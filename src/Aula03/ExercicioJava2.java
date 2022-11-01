package Aula03;

import java.util.Scanner;

public class ExercicioJava2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int valor[] = new int[10];
        int contPar = 0, contImpar = 0;

        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = sc.nextInt();
            if (valor[i] % 2 == 0 ) {
                contPar++;
            }
        }
        for (int j = 0; j < valor.length; j++) {
            if (valor[j] % 2 == 1) {
                contImpar++;
            }
        }
        System.out.println("Total par = " + contPar);
        System.out.println("Total  impar = " + contImpar);
    }
}

