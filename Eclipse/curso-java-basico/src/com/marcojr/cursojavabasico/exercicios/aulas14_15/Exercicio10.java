package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Informe seu turno (M - V - N):");
		String turno = scan.next();
		
		//if-else
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Turno inválido!");
		}
			
		//switch-case
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Turno inválido!");
		
		}
			
	}

}
