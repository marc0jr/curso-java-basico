package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro valor: ");
		double lado1 = scan.nextInt();
		System.out.println("Informe o segundo valor: ");
		double lado2 = scan.nextInt();
		System.out.println("Informe o terceiro valor: ");
		double lado3 = scan.nextInt();
		
		String triangulo = "";
		
		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
			
			if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				triangulo = "Escaleno";
			
			} else if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				triangulo = "Equil�tero";
				
			} else {
				triangulo = "Is�celes";	
				
			}	
		} 
		
		if (triangulo == "") {
			System.out.println("Valores n�o correspondem a um tri�ngulo.");
		} else {
			System.out.println("Os valores formam um tri�ngulo: "+ triangulo);
		}
				
	}

}
