package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int var = 1;
		int valor;
		int par = 0;
		int imp = 0;
		
		for (int i = 0; i < 10; i++, var++) {
			System.out.println("Informe o "+ var +"º número: ");
			valor = scan.nextInt();
			
			if(valor % 2 == 0) {
				par++;
			} else {
				imp++;
			}
		}
		
		System.out.println("Quantdade de numeros pares: "+ par);
		System.out.println("Quantdade de numeros impares: "+ imp);
	}

}
