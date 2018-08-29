package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int maior = Integer.MIN_VALUE;
		int num;
		
		for (int i = 0; i < 5 ; i++ ) {
			System.out.println("Informe um número: ");
			num = scan.nextInt();
			
			if (num > maior ) {
				maior = num;
				System.out.println("O numero maior mudou: "+ maior);
			}
		}

		System.out.println("O maior valor Digitado foi: "+ maior);
	}

}
