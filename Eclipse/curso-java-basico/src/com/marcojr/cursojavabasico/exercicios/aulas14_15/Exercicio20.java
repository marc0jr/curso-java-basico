package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Telefonou para a V�tima? (Sim ou N�o)");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime? (Sim ou N�o)");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da v�tima? (Sim ou N�o)");
		String resposta3 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima? (Sim ou N�o)");
		String resposta4 = scan.next();
		
		System.out.println("Devia para a v�tima? (Sim ou N�o)");
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
			System.out.println("C�mplice");
		} else if (cont == 5) {
			System.out.println("Assassino!");
		} else if (cont == 0) {
			System.out.println("Inoscente");
		}
		
	}

}
