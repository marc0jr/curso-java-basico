package com.marcojr.cursojavabasico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		/* System.out.println("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade!");
		} else {
			System.out.println("Menor de idade!");
		} */
		
		// valor < 10 : Barato!
		// valor >= 10 e < 15 : Peça Desconto!
		// valor >=15 e < 20 : Pode pesquisar mais!
		// valor > 20 : Muito Caro!
		
				
		System.out.println("Entre com um valor: ");
		double valor = scan.nextDouble();
		
		if (valor < 10) {
			System.out.println("Barato! Pode comprar!");
		} else if (valor >=10 && valor < 15) {
			System.out.println("Peça um desconto!");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais!");
		} else {
			System.out.println("Produto muito caro!");
		}
		
	}

}
