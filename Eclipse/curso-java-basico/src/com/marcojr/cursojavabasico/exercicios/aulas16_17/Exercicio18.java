package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe um numero: ");
		int num =  scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo, pois é divisivel por: "+ i);
				primo = false;
			}
				
		}
		
			if (primo) {
				System.out.println("É primo.");
		}

	}

}
