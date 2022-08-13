package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/* 7. Faça um Programa que calcule a área de um quadrado, em seguida
		mostre o dobro desta área para o usuário.*/

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a base do quadrado: ");
		double baseQ = teclado.nextDouble();
		System.out.println("Digite a altura do quadrado : ");
		double alturaQ = teclado.nextDouble();
		double areaD = (baseQ*alturaQ)*2;
		System.out.println("O dobro da área é: " +areaD);
		
		
	}

}
