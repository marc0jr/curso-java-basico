package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Telefonou para a Vítima? (Sim ou Não)");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime? (Sim ou Não)");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vítima? (Sim ou Não)");
		String resposta3 = scan.next();
		
		System.out.println("Já trabalhou com a vítima? (Sim ou Não)");
		String resposta4 = scan.next();
		
		System.out.println("Devia para a vítima? (Sim ou Não)");
		String resposta5 = scan.next();

		int cont = 0;
		
		if (resposta1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resposta5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		} else if (cont == 5) {
			System.out.println("Assassino!");
		} else if (cont == 0) {
			System.out.println("Inoscente");
		}
		
	}

}
