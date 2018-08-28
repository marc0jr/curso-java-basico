package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Deseja comprar quantos Kg de maçã: ");
		double macaKg = scan.nextDouble();
		System.out.println("Deseja comprar quantos Kg de morango: ");
		double morangoKg = scan.nextDouble();
		
		double precoMaca = 0;
		double precoMorango = 0;
		double totalKg = macaKg + morangoKg;
		
		if (macaKg <= 5) {
			precoMaca = 1.80;
		}else {
			precoMaca = 1.50;
		}
		
		if (morangoKg <= 5) {
			precoMorango = 2.50;
		} else {
			precoMorango = 2.20;
		}
		
		double precoTotalMorango = morangoKg * precoMorango;
		double precoTotalMaca = macaKg * precoMaca;
				
		double valorParcial = precoTotalMaca + precoTotalMorango;
		double valorTotal = valorParcial;
		
		if (totalKg > 8 || valorTotal > 25) {
			System.out.println("Desconto de 10%!");
			valorTotal = valorParcial - (valorParcial * 10) / 100;
		} else {
			System.out.println("Sem aplicação de desconto!");
		}
		
		System.out.println("O valor total da compra é de: "+valorTotal);
		

	}

}
