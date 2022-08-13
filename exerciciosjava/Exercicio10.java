package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10.Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.*/
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		float c = scan.nextFloat();
		float f = c*1.8f + 32;
		System.out.println("Convertendo " +c+"F para Farenheit " +f+"F");
		


	}

}
