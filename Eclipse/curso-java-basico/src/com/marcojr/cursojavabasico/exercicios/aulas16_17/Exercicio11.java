package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num1, num2;
		int soma = 0;
		
		System.out.println("Informe o primeiro numero inteiro: ");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo numero inteiro: ");
		num2 = scan.nextInt();
		

		for (int i = num1; i <= num2 ; i++) {
			soma += i;
			System.out.print(soma + " ");
		}
	
		System.out.println("\nResultado da soma: "+ soma);
	}

}
