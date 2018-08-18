package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		//Dobro da área de um quadrado.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de um dos lados do quadrado:");
		double valor = scan.nextDouble();
		double dobroArea = 2 * Math.pow(valor, 2);
		System.out.println("O dobro da area do quadrado é de: "+dobroArea);
		
	}

}
