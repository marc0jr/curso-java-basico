package com.marcojr.cursojavabasico.exercicios.aulas16_17;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int popPaisA = 80000;
		int popPaisB = 200000;
		int ano = 0;
		
		while (popPaisA < popPaisB) {
			
			popPaisA += (popPaisA * 3) / 100;
			popPaisB += (popPaisB * 1.5) / 100;
			ano++;	
		} 
		
		System.out.println("Popula��o A: "+ popPaisA);
		System.out.println("Popula��o B: "+ popPaisB);
		System.out.println("Total de anos para Pais A ter igual ou maior popula��o"
				+ " que pais B: "+ ano);

	}

}
