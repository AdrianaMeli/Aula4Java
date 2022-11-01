package Aula01;

public class Exercicio3 {

	public static void main(String[] args) {

		
		
		float salarioBruto, adicionalNoturno, hExtras, salarioLiquido, descontos;
		
	
		
		java.util.Scanner leia = new java.util.Scanner(System.in);
		
		System.out.println("Digite o salario:");
		salarioBruto = leia.nextInt();
		
		System.out.println("Digite o abono:");
		adicionalNoturno = leia.nextInt();
		
		System.out.println("Digite o abono:");
		hExtras = leia.nextInt();
		
		System.out.println("Digite o abono:");
		descontos = leia.nextInt();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (hExtras * 5) - descontos;
		
		System.out.println("\nO salario e" + salarioLiquido);

		
	}

}
