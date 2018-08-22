package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três valores:");
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int valor3 = scan.nextInt();
		
		//Maior Valor
		if (valor1 >= valor2 && valor1 >= valor3) {
			System.out.println("Maior valor: "+ valor1);
		} else if (valor2 >= valor1 && valor2 >= valor3) {
			System.out.println("Maior valor: "+ valor2);
		} else if (valor3 >= valor2 && valor3 >= valor1) {
			System.out.println("Maior valor: "+ valor3);
		} else {
			System.out.println("Valores Iguais!");
		}
	}
}
