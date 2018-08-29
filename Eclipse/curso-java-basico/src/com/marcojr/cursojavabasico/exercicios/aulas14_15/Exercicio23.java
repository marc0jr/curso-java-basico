package com.marcojr.cursojavabasico.exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual tipo de carne deseja levar? (F - File, A - Alcatra,"
				+ " P - Picanha) ");
		String tipoCarne = scan.next();
		
		System.out.println("Quantos Kg deseja levar: ");
		double totalKg = scan.nextDouble();
		
		double precoCarne = 0;
		
		if (tipoCarne.equalsIgnoreCase("f")) {
			
			if(totalKg <= 5) {
				precoCarne = 4.90;
			}else {
				precoCarne = 5.80;
			}
			
		} else if (tipoCarne.equalsIgnoreCase("a")) {
			
			if(totalKg <= 5) {
				precoCarne = 5.90;
			}else {
				precoCarne = 6.80;
			}
			
		} else if (tipoCarne.equalsIgnoreCase("p")) {
			
			if(totalKg <= 5) {
				precoCarne = 6.90;
			}else {
				precoCarne = 7.80;
			}
		}
		
		double valorTotal = totalKg * precoCarne;
		
		System.out.println("Qual a forma de pagamanto? (D - Dinhero, C - Cartao Tabajara)");
		String formaPagamento = scan.next();
		
		double valorDesconto = 0;
		double valorPagar = 0;
		
		if (formaPagamento.equalsIgnoreCase("c")) {
			valorDesconto = (valorTotal * 5) / 100;
			valorPagar = valorTotal - valorDesconto; 
			System.out.println("Desconto aplicado!");
		} else {
			System.out.println("Sem aplicação de desconto!");
			valorPagar = valorTotal;
		}
		
		System.out.println("\n---CUPOM FISCAL---");
		System.out.println("\nTipo de carne: "+ tipoCarne);
		System.out.println("Quantidade em Kg: "+ totalKg);
		System.out.println("Forma de pagamento: "+ formaPagamento);
		System.out.println("Valor do desconto: "+ valorDesconto);
		System.out.println("Valor total: "+ valorTotal);
		System.out.println("\nValor à pagar: "+ valorPagar);
		
		

	}

}
