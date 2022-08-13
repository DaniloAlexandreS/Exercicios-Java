package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//3-)Faça Programa que peça dois números e imprima a soma
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite 2 números: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		System.out.println(numero1+numero2);		

	}

}
