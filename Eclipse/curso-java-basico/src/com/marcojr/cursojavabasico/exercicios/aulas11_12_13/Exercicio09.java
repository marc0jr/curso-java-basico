package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Temperatura Fº -> Cº
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa a quantidade de graus em Fº: ");
		int grausF = scan.nextInt();
		
		int grausC = (5 * (grausF-32) / 9);
		
		System.out.println("O valor informado em graus Cº será de: "+ grausC);
		

	}

}
