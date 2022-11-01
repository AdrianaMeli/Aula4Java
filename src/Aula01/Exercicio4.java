package Aula01;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, diferenca;
		


		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		

		
		System.out.println("Digite o num1:");
		num1 = leia.nextInt();
		
		System.out.println("Digite o num2:");
		num2 = leia.nextInt();
		
		System.out.println("Digite o num3:");
		num3 = leia.nextInt();
		
		System.out.println("Digite o num4:");
		num4 = leia.nextInt();
		
		diferenca = (num1 * num2) - (num3 * num4);
		
		System.out.println("\n"  + diferenca);

	}

}
