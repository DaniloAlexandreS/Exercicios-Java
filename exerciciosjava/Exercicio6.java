package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//6-) Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o Raio do Círculo: ");
		double r = teclado.nextDouble();
		double area = 3.14*(r*r);
		System.out.println("A area do círculo é " +area);
		
			
		

	}

}
