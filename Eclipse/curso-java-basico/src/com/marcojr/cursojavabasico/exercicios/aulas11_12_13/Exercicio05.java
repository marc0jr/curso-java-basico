package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double raio;
		double area;
		double pi = Math.PI;
		
		System.out.println("--C�lculo da �rea de um c�rculo--");
		System.out.println("\n Informe o valor do Raio do C�rculo:");
		raio = scan.nextFloat();
		area = pi * Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo � de: "+ area);
		
	}

}
