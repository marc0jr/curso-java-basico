package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a 1� nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Informe a 2� nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("Informe a 3� nota: ");
		double nota3 = scan.nextDouble();
		System.out.println("Informe a 4� nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A media foi de: " + media);
		
	}

}
