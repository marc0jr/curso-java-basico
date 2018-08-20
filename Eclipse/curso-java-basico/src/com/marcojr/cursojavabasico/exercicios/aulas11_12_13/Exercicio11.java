package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Numeros reais e inteiros
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois numeros reais e um inteiro respectivamente:");
		int primeiroNumero = scan.nextInt();
		int segundoNumero = scan.nextInt();
		double terceiroNumero = scan.nextDouble();
		
		int resultado1 = (2 * primeiroNumero) + (segundoNumero / 2);
		double resultado2 = (3 * primeiroNumero) + terceiroNumero;
		double resultado3 = Math.pow(terceiroNumero, 3);
		
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: "+resultado1);
		System.out.println("Soma do triplo do primeiro mais o terceiro numero: "+resultado2);
		System.out.println("Terceiro numero elevado ao cubo: "+resultado3);

	}

}
