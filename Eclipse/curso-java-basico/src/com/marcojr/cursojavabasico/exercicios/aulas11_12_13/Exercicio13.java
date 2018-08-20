package com.marcojr.cursojavabasico.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Salario Bruto e Líquido
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o valor ganho por hora: ");
		int valorHora = scan.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		int qdtHorasMes = scan.nextInt();
		int salarioBruto = valorHora*qdtHorasMes;
		System.out.println("Seu salaro bruto mensal é de: "+salarioBruto);
		
		double descontoIR = (salarioBruto / 100) * 11;
		double pagamentoINSS = (salarioBruto / 100) * 8;
		double pagamentoSindicado = (salarioBruto / 100) * 5;
		double salarioLiquido = salarioBruto - descontoIR - pagamentoINSS - pagamentoSindicado;
		double totalDescontos = descontoIR + pagamentoINSS + pagamentoSindicado;
		
		System.out.println("Você pagou ao INSS: "+pagamentoINSS+ " reais.");
		System.out.println("Você pagou ao Sindicato: "+pagamentoSindicado);
		System.out.println("Foram descontados "+ descontoIR +" reais do IR");
		System.out.println("O total de descontos foi de: "+ totalDescontos);
		System.out.println("Seu salario Líquido é de: "+ salarioLiquido);
		
		
		

	}

}
