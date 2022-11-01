package Aula01;


public class Exercicio2 {
	
	

	public static void main(String[] args) {

		
		float nota1, nota2, nota3,nota4, mediaFinal ;
		
		
java.util.Scanner leia = new java.util.Scanner(System.in);
		
		System.out.println("Digite a nota1:");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a nota2:");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a nota3:");
		nota3 = leia.nextInt();
		
		System.out.println("Digite a nota4:");
		nota4 = leia.nextInt();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("\nA media final:" + mediaFinal);

	}

}
