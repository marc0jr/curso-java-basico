package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de turmas: ");
		int numTurmas = scan.nextInt();
		
		int qtdAlunos = 0;
		int somaAlunos = 0;
		boolean valido = true;
		
		for (int i = 1; i <= numTurmas; i++) {
		
			valido = true;
			
			do {
				System.out.println("Informe a quantidade de alunos da tuma "+ i +": ");
				qtdAlunos = scan.nextInt();
				
				if (qtdAlunos > 40) {
					System.out.println("A turma não pode conter mais de 40 alunos. Digite novamente.");

				} else {
					valido = false;
				}
				
			} while (valido);
			
			somaAlunos += qtdAlunos;
			
		}
		
		double media = somaAlunos / numTurmas;
		System.out.println("Media de alunos por turma: "+ media);

	}

}
