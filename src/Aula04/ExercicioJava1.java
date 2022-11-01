package Aula04;

import java.util.Scanner;

public class ExercicioJava1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaraçao do vetor
        int[] vetor = new int[10];

        // declaracao de variavel
        int num;
        boolean validador = false;

        // entrada de dados -> vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = in.nextInt();
        }
        // entrada de dados -> variável
        System.out.println("Digite um valor para procurar no vetor");
        num = in.nextInt();
        // leitura do vetor
        for (int index =0 ; index < vetor.length ; index ++)
        {
            if (vetor[index]== num)
            {
                System.out.println("O número "+num+" está localizado na posição: "+index);
                validador = true;
            }
        }
        if ( validador == false)
            System.out.println("O número "+num+" não foi encontrado!");
    }
}













