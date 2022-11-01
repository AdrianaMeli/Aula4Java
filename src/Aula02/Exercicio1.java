package Aula02;

import java.util.Scanner;

public class Exercicio1 {



    public static void main(String[] args) {


        int num1, num2, num3 ;
        int local, mediaFinal = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a num1:");
        num1 = leia.nextInt();

        System.out.println("Digite a num2:");
        num2 = leia.nextInt();

        System.out.println("Digite a num3:");
        num3 = leia.nextInt();



        if (num1 > num2)
            local = num1;
        else
            local = num2;

        if(local > num3)
            System.out.printf("O número maior é: %d", local);
        else
            System.out.printf("O número maior é: %d", num3);


    }

}