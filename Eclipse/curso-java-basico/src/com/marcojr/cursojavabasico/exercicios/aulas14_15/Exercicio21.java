package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tipo de combustível (G - Gasolina ou A - Álcool)");
		String tipoComb = scan.next();

		System.out.println("Informe quantos litros quer abastecer:");
		int litros = scan.nextInt();

		double valorGas = 2.50;
		double valorAlc = 1.90;
		double percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;

		if (tipoComb.equalsIgnoreCase("a")) {

			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}

			total = litros * valorAlc;
			totalDesconto = (percDesconto * total) / 100;

		} else if (tipoComb.equalsIgnoreCase("g")) {

			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}

			total = litros * valorGas;
			totalDesconto = (percDesconto * total) / 100;
		}

		double valorPagar = total - totalDesconto;

		System.out.println("Tipo de Combustível selecionado: " + tipoComb);
		System.out.println("Número de litros: " + litros);
		System.out.println("Valor a Pagar: " + valorPagar);
	}

}
