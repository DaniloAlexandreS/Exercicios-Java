package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//4-) Faça um Programa que peça as 4 notas bimestrais e mostre a média
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite quanto voçê tirou no 1ºBimestre: ");
		double nota1b = teclado.nextDouble();
		System.out.print("Digite quanto voçê tirou no 2ºBimestre: ");
		double nota2b = teclado.nextDouble();
		System.out.print("Digite quanto voçê tirou no 3ºBimestre: ");
		double nota3b = teclado.nextDouble();
		System.out.print("Digite quanto voçê tirou no 4ºBimestre: ");
		double nota4b = teclado.nextDouble();
		System.out.println("Sua Média foi de: " +(nota1b+nota2b+nota3b+nota4b)/4);
		
		
		
		
	}

}
