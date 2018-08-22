package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qualquer valor:");
		double valor = scan.nextDouble();
		
		if (valor >= 0) {
			System.out.println("Valor positivo!");
		} else {
			System.out.println("Valor negativo!");
		}

	}

}
