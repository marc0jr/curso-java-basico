package com.marcojr.cursojavabasico.exercicios.aulas16_17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int qtdProd;
		double totalCompra;
		double valorProd = 0;
		double valorPago, troco;
		String continuarCompra;
		String output;
		boolean sair = false;
		
		do { 
			System.out.println("Deseja informar uma nova compra? (S/N)");
			continuarCompra =  scan.next();
			
			if(continuarCompra.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Informe a quantidade de produtos: ");
				qtdProd = scan.nextInt();
				totalCompra =  0;
				
				for (int i = 1; i <= qtdProd; i++) {
					System.out.println("Informem o valor do produto "+ i);
					valorProd = scan.nextDouble();
					totalCompra += valorProd;
					output += "Produto "+ i +": R$ "+ valorProd +"\n";
				}
				output += "Total: R$ " + totalCompra + "\n";
				
				System.out.println("Total: R$ "+ totalCompra);
				
				System.out.println("Informe o valor pago: ");
				valorPago = scan.nextDouble();
				
				output += "Dinhero: R$ " + valorPago + "\n";
				
				troco = valorPago - totalCompra;
				
				output += "Troco: R$ "+ troco + "\n";
				
				System.out.println(output);
				
			}else {
				sair = true;
			}		
			
		}while (!sair);	
		
	}

}
