package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int numPessoas = scan.nextInt();
		
		int cont = 1;
		int idade = 0;
		int somaIdade = 0;
		
		for (int i = numPessoas; i > 0 ; i--) {
			
			System.out.println("Informe a "+ cont +"ª idade: ");
			idade = scan.nextInt();
			somaIdade += idade;
			cont ++;	
		}
		
		double mediaIdade = somaIdade / numPessoas; 
		
		System.out.println("Media da turma: "+mediaIdade);
		
		if (mediaIdade > 0 && mediaIdade <= 25) {
			System.out.println("A media da turma é jovem!");
		} else if (mediaIdade > 25 && mediaIdade <= 60) {
			System.out.println("A media da turma é adulta!");
		} else if (mediaIdade > 60) {
			System.out.println("A media da turma é idosa");
		
		}

	}

}
