package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Temperatura F� -> C�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um valor em graus em F�: ");
		int grausF = scan.nextInt();
		
		int grausC = (5 * (grausF-32) / 9);
		
		System.out.println(grausF + " F� equivale � "+grausC+" C�.");
		

	}

}
