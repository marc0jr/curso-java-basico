package com.marcojr.cursojavabasico.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		System.out.println("Contagem de 0 até 10:");
		
		int i = 0;
		int max = 10;
		
		while ( i < max) {
			System.out.println("Valor de i: "+ i);
			i++;
		}
		 System.out.println("Valor atual de i: "+ i);
		 
		 //valor atual de i: 11
		do {
			++i;
			System.out.println("Valor de i: "+ i);
		} while (i < 15); 
			
		System.out.println("\nValor de i: " + i);

	}
	
}