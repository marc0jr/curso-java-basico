package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota parcial do aluno: ");
		double primeiraNota = scan.nextDouble();
		System.out.println("Informe a segunda nota parcial do aluno: ");
		double segundaNota = scan.nextDouble();
		
		double mediaAproveitamento = (primeiraNota + segundaNota) / 2;
		
		String conceito = "";
		String situacao = "";
		
		if (mediaAproveitamento >= 9 && mediaAproveitamento <= 10) {
			conceito = "A";
			situacao = "APROVADO!";
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			conceito = "B";
			situacao = "APROVADO!";
		} else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			conceito = "C";
			situacao = "APROVADO!";
		} else if (mediaAproveitamento >= 4 && mediaAproveitamento < 6) {
			conceito = "D";
			situacao = "REPROVADO";
		} else if (mediaAproveitamento < 4 ) {
			conceito = "E";
			situacao = "REPROVADO";
		}
				
		System.out.println("Nota 1: "+ primeiraNota);
		System.out.println("Nota 2: "+ segundaNota);
		System.out.println("Media do Aluno: "+ mediaAproveitamento);
		System.out.println("Conceito Correspondente: "+ conceito);
		System.out.println("Situação do Aluno: "+ situacao);

	}

}
