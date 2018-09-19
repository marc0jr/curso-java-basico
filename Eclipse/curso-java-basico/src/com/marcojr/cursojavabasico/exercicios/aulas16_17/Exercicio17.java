package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o valor fatorial que deseja calcular: ");
		int fator =  scan.nextInt();
		
		int var = 1;
		
		for(int i = fator; i > 0 ; i--) {
			
			var *= i;
	
		}
		
		System.out.println("Resultado: "+ var);
	
	}

}
