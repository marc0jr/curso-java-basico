package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Deseja tirar a media de quantas notas: ");
		int numNota = scan.nextInt();
		
		int cont = 1;
		double nota = 0;
		double somaNota = 0;
		
		for (int i = numNota; i > 0 ; i--) {
			
			System.out.println("Informe o valor da "+ cont +"ª nota: ");
			nota = scan.nextDouble();
			somaNota += nota;
			cont ++;	
		}
		
		double media = somaNota / numNota;
		System.out.println("O valor da media será de: "+  media);

	}

}
