package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Monta a tabuada de: ");
		int tabuada = scan.nextInt();
		
		int comeco, termino;
		int resultado;
		boolean invalido = true;
		
		do {
			System.out.println("Deseja iniciar por qual numero: ");
			comeco = scan.nextInt();
			
			System.out.println("Deseja que termine por qual numero: ");
			termino = scan.nextInt();
			
			if (termino > comeco) {
				invalido = false;	
			}else {
				System.out.println("O valor inicial não pode ser maior que o "
						+ "final. Digite novamente!");
			}
		}while (invalido);
		
		System.out.println("Vou montar a tabuada de "+ tabuada + " começando"
				+ " por "+ comeco + " e terminando em "+ termino+ ".");
		for (int i = comeco ; i <= termino; i++) {
			resultado = tabuada * i;
			System.out.println(tabuada + " * " + i + " = "+ resultado );
		}
	
	}

}
