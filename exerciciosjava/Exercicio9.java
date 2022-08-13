package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*9. Faça um Programa que peça a temperatura em graus Farenheit,
		transforme e mostre a temperatura em graus Celsius.
		o C = (5 * (F-32) / 9).*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a tempera em Farenheit: ");
		float f = scan.nextFloat();
		float c = (5 * (f-32) / 9);
		System.out.println("Convertendo " +f+"F para Celsius " +c+"°");
		
		
			

	}

}
