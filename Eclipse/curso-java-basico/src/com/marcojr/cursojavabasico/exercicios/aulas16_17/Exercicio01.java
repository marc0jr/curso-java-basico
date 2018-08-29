package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean valido = false;
		
		do {
			System.out.println("Informe uma nota entre 0 e 10: ");
			double nota = scan.nextDouble();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida!");
			} else {
				System.out.println("Nota válida!");
				valido = true;
			}
			
		} while(!valido);	
		
	}

}
