package danilo.exerciciosjava;

import java.util.Scanner;

  public class Exercicio2 {

	public static void main(String[] args) {
		/*2-)Faça um Programa que peça um npumero e então mostre a mensagem 
		O Número informado foi: [Número]
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		System.out.println("O número informado foi: " +numero);
	}

}
