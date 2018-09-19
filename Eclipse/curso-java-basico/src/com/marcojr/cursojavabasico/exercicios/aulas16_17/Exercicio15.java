package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int num1 = 1;
		int num2 = 1;
		int num3;
		
		System.out.println("Informe a quantidade de termos para o Fibonacci: ");
		int valor = scan.nextInt();
		
		for (int i = valor; i > 0 ; i--) {
			
			System.out.println(num1 + " ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
		}

	}

}
