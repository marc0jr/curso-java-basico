package com.marcojr.cursojavabasico.exercicios.aulas16_17;

public class Exercicio24 {

	public static void main(String[] args) {
		
		double preco = 0.18;
		double valorTotal = 1;
		
		System.out.println("Pre�o do p�o: R$ 0,18");
		System.out.println("***** Panificadora p�o de ontem - Tabela de pre�os *****");
		
		for (int i = 1 ; i <= 50 ; i++) {
			valorTotal = preco * i; 
			System.out.println(i + " - R$ " + valorTotal);
		}
	}

}
