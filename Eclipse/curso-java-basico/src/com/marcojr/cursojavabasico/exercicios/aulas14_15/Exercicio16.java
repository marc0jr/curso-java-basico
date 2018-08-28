package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valorA = 0;
		double valorB = 0;
		double valorC = 0;
		
		System.out.println("Informe o valor de A: ");
		valorA = scan.nextDouble();
		
		if(valorA == 0) {
			System.out.println("A equação não é do segundo grau.");
		} else {
			System.out.println("Informe o valor de B: ");
			valorB = scan.nextInt();
			System.out.println("Informe o valor de C: ");
			valorC = scan.nextInt();
			
			double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
			
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais.");
			} else if (delta >= 0 && valorA > 0) {
				System.out.println("Valor de Delta: "+delta);
				
				double raiz1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
				double raiz2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);	
				
				System.out.println("\nO valor da primeira raíz é: " + raiz1);
				System.out.println("\nO valor da segunda raíz é: " + raiz2);
			}	
		}
		
	}

}
