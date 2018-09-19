package com.marcojr.cursojavabasico.exercicios.aulas16_17;

public class Exercicio23 {

	public static void main(String[] args) {
		
		double preco = 1.99;
		double valorTotal = 1;
		
		System.out.println("***** Loja Quase Dois - Tabela de preços *****");
		
		for (int i = 1 ; i <= 50 ; i++) {
			valorTotal = preco * i; 
			System.out.println(i + " - R$ " + valorTotal);
		}
	}

}
