package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe dois valores:");
	int valor1 = scan.nextInt();
	int valor2 = scan.nextInt();
	
	if (valor1 < valor2) {
		System.out.println("Maior valor: "+ valor2);
	} else if (valor1 > valor2) {
		System.out.println("Maior valor: "+ valor1);
	} else {
		System.out.println("Valores Iguais!");
	}
	
	}

}
