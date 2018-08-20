package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Informe o primeiro valor: ");
	int valor1 = scan.nextInt();
	System.out.println("Informe o segundo valor: ");
	int valor2 = scan.nextInt();
	
	System.out.println("A soma dos valores informados foi de: "+ (valor1 + valor2));

	}

}
