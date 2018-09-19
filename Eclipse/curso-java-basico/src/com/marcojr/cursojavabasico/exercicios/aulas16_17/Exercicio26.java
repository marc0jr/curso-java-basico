package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o fatorial que deseja calcular: ");
		int fatorial =  scan.nextInt();
		
		int resultado = 1;
		
		System.out.println("Fatorial de: "+ fatorial);
		System.out.print(fatorial + "! = ");
		
		for (int i = fatorial; i > 1; i--) {
			resultado *= i;
			System.out.print(i + " . "); 
		}
		
		System.out.println("1 = "+ resultado);
		
	}

}
