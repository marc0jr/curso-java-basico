package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de temperaturas a serem informadas: ");
		int qtd = scan.nextInt();
		
		double valor;
		double totalValor = 0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Informe a "+ i +"ª temperatura: ");
			valor = scan.nextInt();
			totalValor += valor;
			
			if (valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
		}
		
		System.out.println("Media = "+ (totalValor/qtd));
		System.out.println("Maior temperatura: "+ maior);
		System.out.println("Menor temperatura: "+ menor);
		
	}

}
