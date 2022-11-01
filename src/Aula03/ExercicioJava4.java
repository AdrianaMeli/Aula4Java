package Aula03;

import java.util.Scanner;

public class ExercicioJava4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1 = 0, menores = 0, maiores = 0;
        while (n1 >= 0) {
            System.out.println("Digite sua idade:");
            n1 = read.nextInt();

            if(n1 > 0 &&  n1 < 21){
                menores++;
            }
            if (n1 > 50){
                maiores++;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos:" + menores);
        System.out.println("Total de pessoas maiores de 50 anos:" + maiores);

    }
}