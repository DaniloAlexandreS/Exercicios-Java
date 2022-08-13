package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//5-) Faça um programa que converta metros em centímetros.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva a metragem para converter para centimetros : ");
		double metragem = teclado.nextDouble();
		double centimetros = metragem*100;
		System.out.println(""+metragem+"m  Vale: " +centimetros+"cm");
		

	}

}
