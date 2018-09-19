package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o valor da tabuada que deseja: ");
		int valor = scan.nextInt();
		System.out.println("Tabuada de "+ valor +":");
		
		for (int i = 1, c; i <= 10; i++) {
			c = valor * i;
			System.out.println(valor +" X "+ i +" = "+ c);
		}

		
	}

}
