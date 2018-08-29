package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int soma = 0;
		int num;
		double media = 0;	
			
				for (int i = 1; i <= 5 ; i++ ) {
					System.out.println("Informe um número: ");
					num = scan.nextInt();
					
					soma += num;
				} 
				
					media = soma / 5;
			
				System.out.println("A soma dos valores = "+ soma);
				System.out.println("A media dos valores = "+ media);
		}

}


