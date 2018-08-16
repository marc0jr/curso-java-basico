package com.marcojr.cursojavabasico.aula13;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + (resultado1));
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + (resultado2));
		
		boolean resultado3 = (valor1 == 1) ^ (valor2 == 2);
		System.out.println("valor1 é 1 XOR valor2 é 2 - resultado: " + (resultado3));
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && verdadeiro);
		System.out.println(verdadeiro || verdadeiro);
		System.out.println(verdadeiro ^ verdadeiro);
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && verdadeiro);
		
	
		
		
	}

}
