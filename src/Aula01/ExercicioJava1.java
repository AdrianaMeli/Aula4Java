package Aula01;

import java.util.Scanner;

public class ExercicioJava1 {

	public static void main(String[] args) {

		
		
		float salario, abono, novoSalario;
		
		

	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salario:");
		salario = leia.nextInt();
		
		System.out.println("Digite o abono:");
		abono = leia.nextInt();
		
		novoSalario = abono + salario;
		
		System.out.println("\nO salario e" + novoSalario);

		
	}

}
