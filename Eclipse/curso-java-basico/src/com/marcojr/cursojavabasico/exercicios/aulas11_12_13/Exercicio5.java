package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double raio;
		double area;
		double pi = 3.14159;
		
		System.out.println("--Cálculo da área de um círculo--");
		System.out.println("\n Informe o valor do Raio do Círculo:");
		raio = scan.nextFloat();
		area = pi * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é de: "+ area);
		
	}

}
