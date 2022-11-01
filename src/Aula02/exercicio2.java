package Aula02;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {



    public static void main(String[] args) {
//Constrói um objeto que permite inserir numeros no console
Scanner numeros = new Scanner(System.in);

// Constrói um Array com 5 posições
        int[] listaDeNumeros = new int[4];

        // Preenche o Array a parti da posição 1
        for (int i = 1; i < listaDeNumeros.length; i++)
        {
        System.out.print("Digite "+ i + "° numeros: ");
        listaDeNumeros[i] = (numeros.nextInt());
        }

        // Coloca o Array em ordem crescente
        Arrays.sort(listaDeNumeros);

        // Lista o Array em ordem crescente
        System.out.print("Ordem crescente:    ");
        for (int j = 1; j < listaDeNumeros.length; j++)
        {
        System.out.print(listaDeNumeros[j]+ "  ");
        }



        }
        }