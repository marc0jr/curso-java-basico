package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		//Salário no mês.
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Informe o valor ganho por hora: ");
		int valorHora = scan.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		int qdtHorasMes = scan.nextInt();
		int salario = valorHora*qdtHorasMes;
		System.out.println("Seu salaro mensal é de: "+salario);

	}

}
