package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo numero: ");
		int num2 = scan.nextInt();
		System.out.println("Qual opera��o deseja fazer: (+, -, *, /) ");
		String operacao = scan.next();
		
		int resultadoOperacao = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultadoOperacao = num1 + num2; break;
		case "-": resultadoOperacao = num1 - num2; break;
		case "*": resultadoOperacao = num1 * num2; break;
		case "/": resultadoOperacao = num1 / num2; break;
		default: System.out.println("Opera��o inv�lida!"); valida = false;
		}
		
		if (valida) {
			System.out.println("Resultado da Opera��o= "+ resultadoOperacao);
			if (resultadoOperacao >= 0) {
				System.out.println("Resultado positivo!");
			} else {
				System.out.println("Resultado Negativo!");
			}
			
			if (resultadoOperacao % 2 == 0) {
				System.out.println("N�mero par!");
			} else {
				System.out.println("N�mero impar!");
			}
		}

	}

}
