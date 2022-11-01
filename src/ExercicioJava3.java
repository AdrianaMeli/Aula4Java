
import java.util.Scanner;

public class ExercicioJava3 {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {


        int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, fullstack=0 ;
        String continua = "S";

        while (continua.equals("S")) {

            System.out.println("Digite a sua idade: ");
            idade = leia.nextInt();

            do {
                System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
                sexo = leia.nextInt();

                if(sexo < 1 || sexo > 3)
                    System.out.println("Digite um número entre 1 e 3");

            }while(sexo < 1 || sexo > 3);

            do {
                System.out.println("Digite o qual categoria (1-Backend/2-Frontend/3-Mobile/4-Fullstack): ");
                categoria = leia.nextInt();

                if(categoria < 1 || categoria> 4)
                    System.out.println("Digite um número entre 1 e 4");

            }while(categoria < 1 || categoria > 4);

            if (categoria == 1)
                backend++;

            if (categoria == 2 && sexo == 2)
                frontend++;

            if (categoria == 3 && sexo == 1 && idade > 40)
                mobile++;

            if ((categoria == 1 || categoria == 2) && idade > 30)
                fullstack++;

            System.out.println("Deseja continuar(S/N)? ");
            leia.skip("\\R?");
            continua = leia.nextLine().toUpperCase();

        }

        System.out.println("\nNumero de pessoas desenvolvedoras: " + backend);
        System.out.println("\nTotal de mulheres desevolvedoras  Frontend: " + frontend);
        System.out.println("\nTotal de homens desenvolvedores  Mobile maiores de 40 anos  " + mobile);
        System.out.println("\nTotal de  mulheres desenvolvedoras Fullstack  menores de 30 anos: " + fullstack);
    }

}