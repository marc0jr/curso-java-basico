package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro preço:");
		double preco1 = scan.nextDouble();
		System.out.println("Informe o valor do segundo preço:");
		double preco2 = scan.nextDouble();
		System.out.println("Informe o valor do terceiro preço:");
		double preco3 = scan.nextDouble();
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1: "+ preco1);
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2: "+ preco2);
		} else if (preco3 <= preco2 && preco3 <= preco1) {
			System.out.println("Compre o produto 3: "+ preco3);
		} else {
			System.out.println("Preços iguais!");
		}
	}

}
