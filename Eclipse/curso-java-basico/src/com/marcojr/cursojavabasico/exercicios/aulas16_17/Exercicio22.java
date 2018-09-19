package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de CDs comprados: ");
		int qtdCD = scan.nextInt();
		
		double valorCD = 0;
		double somaCDS = 0;
		
		
		for (int i = 1; i <= qtdCD; i++) {
			
			System.out.println("Informe o valor do CD "+ i +": ");
			valorCD = scan.nextDouble();
			
			somaCDS += valorCD;
		}
		
		double media =  somaCDS / qtdCD;

		System.out.println("Valor total investido: "+ somaCDS);
		System.out.println("Valor medio gasto em cada CD: "+ media);

	}

}
