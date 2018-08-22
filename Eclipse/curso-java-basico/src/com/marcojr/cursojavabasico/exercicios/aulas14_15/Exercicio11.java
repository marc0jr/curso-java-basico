package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Informe seu salário atual: ");
		double salarioAtual = scan.nextDouble();
		
		int percentual = 0;
				
		if (salarioAtual <= 280) {
			percentual = 20;
		} else if (salarioAtual > 280 && salarioAtual <= 700) {
			percentual = 15;
		} else if (salarioAtual > 700 && salarioAtual <= 1500) {
			percentual = 10;			
		} else if (salarioAtual < 1500) {
			percentual = 5;
		}	
			
			double reajuste = (salarioAtual * percentual) / 100;
			double novoSalario = salarioAtual + reajuste;
						
			System.out.println("Salario antes de reajuste: "+ salarioAtual);
			System.out.println("Percentual de aumento aplicado: "+ percentual + " %");
			System.out.println("O valor do aumento foi de: "+ reajuste +" reais.");
			System.out.println("Seu novo salário é de: "+ novoSalario + " reais.");
		

	}

}
