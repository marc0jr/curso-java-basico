package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Conversão Cº -> Fº
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de graus Cº: ");
		int grausC = scan.nextInt();
		
		double grausF = grausC * 1.8 + 32;
		
		System.out.println("O valor informado em graus Fº é de: "+grausF);
		
		
		

	}

}
