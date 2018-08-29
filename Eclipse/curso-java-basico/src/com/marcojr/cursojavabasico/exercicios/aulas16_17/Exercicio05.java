package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double popPaisA;
		double popPaisB;
		double percA;
		double percB;
		
		boolean infoValida = false;
		
		do {
			System.out.println("Informe a população do país A: ");
			popPaisA = scan.nextInt();
						
			if (popPaisA > 0) {	
				infoValida = true;
			
			}else {
				System.out.println("População A precisa ser maior que 0.");
				
			}

		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Informe a população do país B: ");
			popPaisB = scan.nextInt();
			
			if (popPaisB > 0) {	
				infoValida = true;
			
			}else {
				System.out.println("População B precisa ser maior que 0.");
				
			}

		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Informe o percentual de crescimento do pais A: ");
			percA = scan.nextDouble();					
			
			if (percA > 0) {	
				infoValida = true;
			
			}else {
				System.out.println("Percentual A precisa ser maior que 0.");
				
			}

		} while (!infoValida);
		
		infoValida = false;
		
		do {				
			System.out.println("Informe o percentual de crescimento do pais B: ");
			percB = scan.nextDouble();
			
			if (percB > 0) {	
				infoValida = true;
			
			}else {
				System.out.println("Percentual B precisa ser maior que 0.");
				
			}

		} while (!infoValida);
		
		int ano = 0;
		
		while (popPaisA < popPaisB) {
			
			popPaisA += (popPaisA * percA) / 100;
			popPaisB += (popPaisB * percB) / 100;
			ano++;	
		} 
		
		System.out.println("População A: "+ popPaisA);
		System.out.println("População B: "+ popPaisB);
		System.out.println("Total de anos para Pais A ter igual ou maior população"
				+ " que pais B: "+ ano);

	}

}
