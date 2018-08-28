package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Número Par!");
		} else {
			System.out.println("Número Ímpar!");
		}

	}

}
