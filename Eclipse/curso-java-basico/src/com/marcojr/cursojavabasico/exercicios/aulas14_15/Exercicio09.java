package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro numero:");
		int num1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numero:");
		int num2 = scan.nextInt();
		System.out.println("Informe o valor do terceiro numero:");
		int num3 = scan.nextInt();
		
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			//num3 � o maior
			//num1 � o menor
			//num3 > num2 > num1
			System.out.println("A ordem decrescente �: " +num3+ "-" +num2+ "-" +num1);
			
		} else if (num1 <= num2 && num3 <= num2 && num1 <= num3) {
			//num2 � o maior
			//num1 � o menor
			//num2 > num3 > num1
			System.out.println("A ordem decrescente �: " +num2+ "-" +num3+ "-" +num1);
			
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			//num1 � o maior
			//num2 � o menor
			//num1 > num3 > num2
			System.out.println("A ordem decrescente �: " +num1+ "-" +num3+ "-" +num2);
			
		} else if (num1 <= num3 && num2 <= num3 && num2 <= num1){
			//num3 � o maior
			//num2 � o menor
			//num3 > num1 > num2
			System.out.println("A ordem decrescente �: " +num3+ "-" +num1+ "-" +num2);
			
		} else if (num1 <= num2 && num3 <= num2 && num3 <= num1){
			//num2 � o maior
			//num3 � o menor
			//num2 > num1 > num3
			System.out.println("A ordem decrescente �: " +num2+ "-" +num1+ "-" +num3);
			
		} else if (num2 <= num1 && num3 <= num2 && num3 <= num1){
			//num1 � o maior
			//num3 � o menor
			//num1 > num2 > num3
			System.out.println("A ordem decrescente �: " +num1+ "-" +num2+ "-" +num3);
		}
	}

}
