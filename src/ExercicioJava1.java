import java.util.Scanner;

// Java program to find the sum of positive numbers
import java.util.Scanner;

public class ExercicioJava1 {
    public static void main(String[] args) {
        float maior,
                num;
        int soma = 0;
        int count=2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num = entrada.nextFloat();
        maior = num;

        while(num <= 10){
            System.out.print("Numero " + count + ": ");
            num = entrada.nextFloat();

            if(num > 0){
                maior = num;
            }

            count++;
        }

        System.out.println("O maior numero digitado é: "+maior);

    }
}