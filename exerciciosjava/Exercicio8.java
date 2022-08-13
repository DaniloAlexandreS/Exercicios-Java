package danilo.exerciciosjava;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Quanto voçê ganha/hora: ");
		double dHora = teclado.nextDouble();
		System.out.println("Quantas horas você trabalha por mês: ");
		double horas = teclado.nextDouble();
		double salario = dHora*horas;
		System.out.println("O total do Seu salario é: " +salario+ "$");
		
		

	}

}
