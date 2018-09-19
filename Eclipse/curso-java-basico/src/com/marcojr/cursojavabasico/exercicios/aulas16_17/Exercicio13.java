package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o valor da base: ");
		int base =  scan.nextInt();
		System.out.println("Informe o valor da potência: ");
		int pot = scan.nextInt();
		
		int c = 1;
		
		for(int i = 0; i < pot ; ++i) {
			c *= base;
		}
		
		System.out.println("Valor total da potencialização: "+ c);

	}

}
