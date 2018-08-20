package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Peso ideal
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal deve ser de: "+pesoIdeal);

	}

}
