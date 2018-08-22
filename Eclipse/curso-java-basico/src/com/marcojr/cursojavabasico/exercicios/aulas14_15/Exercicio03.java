package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Informe o sexo (F - M):");
		String input = scan.next();
		
		//if-else
		if (input.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo inválido!");
		}
		
		//switch case
		switch(input) {
		case "m":
		case "M": System.out.println("Masculino"); break;
		case "f": 
		case "F": System.out.println("Feminino"); break;
		default: System.out.println("Sexo inválido!");
		}
	}

}
