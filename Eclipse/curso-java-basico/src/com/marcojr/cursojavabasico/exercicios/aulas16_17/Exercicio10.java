package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		int num1, num2;
		
		
		System.out.println("Informe o primeiro numero inteiro: ");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo numero inteiro: ");
		num2 = scan.nextInt();
		

		for (int i = num1; i <= num2 ; i++) {
			System.out.println(i);
		}

	}
	
}