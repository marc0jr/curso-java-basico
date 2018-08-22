package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as notas parciais do aluno:");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2) / 2;
		
		if (media >= 7 && media < 10) {
			System.out.println("Aprovado!");
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media < 7) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Notas incorretas!");
		}

	}

}
