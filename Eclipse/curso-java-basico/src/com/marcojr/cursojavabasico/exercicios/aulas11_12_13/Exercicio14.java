package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Tempo de download de arquivo

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o tamanho do arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Informe a velocidade do link em Mbps: ");
		double velocidadeLink = scan.nextDouble();
		
		double tempoMedio = (tamanhoArquivo / velocidadeLink) / 60;
		
		System.out.println("O tempo para download do arquivo em minutos será de: "+tempoMedio);
		
	}

}
